import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Main {

	
	
	public static void main(String[] args) {
		ObjectContainer bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "Empledep.yap");
		
		Departamento d = new Departamento("Contabilidad", 1, "Rojo");
		Departamento d2 = new Departamento("Informática", 2, "Rojo");
		Departamento d3 = new Departamento("RRHH", 3, "Azul");
		
		Empleado e = new Empleado("Antonio",23,d);
		Empleado e1 = new Empleado("Raul",45,d);
		Empleado e2 = new Empleado("Laura",20,d2);
		Empleado e3 = new Empleado("Pili",41,d3);
		Empleado e4 = new Empleado("Rosa",33,d2);
		
		bd.store(d);
		bd.store(d2);
		bd.store(d3);
		bd.store(e);
		bd.store(e1);
		bd.store(e2);
		bd.store(e3);
		bd.store(e4);

		//Todos los empleados de un departamento
		Departamento dep = new Departamento(null,2,null);
		ObjectSet<Departamento> departamentos = bd.queryByExample(dep);
		ObjectSet<Empleado> empleados = bd.queryByExample(new Empleado(null,0,dep));
		if(departamentos.size()==0) {
			System.out.println("No existe ese departamento");
		}else {
			while(departamentos.hasNext()) {
				Departamento depTemp = departamentos.next();
				System.out.println("Departamento-> " + depTemp.getNombre() + " nº "+depTemp.getNumero()+ 
						" edificio: "+depTemp.getEdificio());
				if(empleados.size()==0) {
					System.out.println("No existe ese departamento");
				}else {
					while(empleados.hasNext()) {
						Empleado empTemp = empleados.next();
						System.out.println("Empleado-> " + empTemp.getNombre() + " edad "+empTemp.getEdad());
					}
				}
			}
		}
		bd.close();
	}
	
}
