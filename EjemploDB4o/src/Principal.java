import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Principal {

	final static String BDPer = "DBPersonas.yap";
	
	public static void main(String[] args) {
	
		//crearPersonas();
		//consultarPersonas();
		//actualizarPersonas();
		//eliminarPersonas();

	}
	
	private static void crearPersonas() {
		//Abrir la BD

				ObjectContainer db= Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),BDPer);

				// Creamos Personas
				Persona p1 = new Persona("Juan", "Guadalajara");
				Persona p2 = new Persona("Ana", "Madrid");
				Persona p3 = new Persona("Luis", "Granada");
				Persona p4 = new Persona("Pedro", "Asturias");
				//Almacenar objetos Persona en la base de datos
				db.store(p1);
				db.store(p2);
				db.store(p3);
				db.store(p4);
				db.close(); //cerrar base de datos
	}
	
	private static void consultarPersonas() {
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDPer);
		//devuelve todos los objetos persona de la bd
		
		Persona persona = new Persona( null, null);
		ObjectSet<Persona> result = db.queryByExample(persona);
		if (result.size() == 0){
			System.out.println("No existen personas en la base de datos");
		}
		while (result.hasNext()) {
			Persona p = result.next();
			System.out.println("\tNombre: " + p.getNombre());
			System.out.println("\tCiudad:" + p.getCiudad());
		}
		
		//búsqueda de objetos Persona con nombre Juan
		
		System.out.println("Juanes:");
		Persona juan = new Persona("Juan", null);
		ObjectSet<Persona> result1 = db.queryByExample(juan);
		while (result1.hasNext()) {
			Persona p = result1.next();
			System.out.println("\tNombre: " + p.getNombre());
			System.out.println("\tCiudad:" + p.getCiudad());
		}
		
		//búsqueda de objetos Persona con ciudad Vitoria
		System.out.println("Vitoria:");
		Persona vitoria = new Persona(null, "Vitoria");
		ObjectSet<Persona> result2 = db.queryByExample(vitoria);
		while (result2.hasNext()) {
			Persona p = result2.next();
			System.out.println("\tNombre: " + p.getNombre());
			System.out.println("\tCiudad:" + p.getCiudad());
		}
		
		db.close();
	}
	
	private static void actualizarPersonas() {
		
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDPer);
		
		Persona per = new Persona("Juan", null);
		ObjectSet<Persona> result = db.queryByExample(per);
		if (result.size() == 0){
			System.out.println( "No existe JUAN");
		}else{
			while (result.hasNext()) {
			Persona existe = result.next();
			existe.setCiudad("Bilbao");
			db.store(existe);
			//consultar los datos
			System.out.println("Nombre: " + existe.getNombre()+ " Ciudad:" +
	
			existe.getCiudad());
			}
		}
		db.close();
	}
	
	private static void eliminarPersonas() {
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BDPer);
		Persona p = new Persona("Juan",null);
		ObjectSet<Persona> result = db.queryByExample(p);
		if (result.size() == 0){
			System.out.println( "No existe JUAN");
		}else{

			while (result.hasNext()) {
				Persona p2 = result.next();
				db.delete(p2);
				//consultar los datos
				System.out.println("Eliminado..");
			}
		}
		db.close();
	}

}
