
public class Departamento {
	private String nombre;
	private int numero;
	private String edificio;
	
	public Departamento() {}
	
	public Departamento(String nombre, int numero, String edificio) {
		this.nombre = nombre;
		this.numero = numero;
		this.edificio = edificio;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEdificio() {
		return edificio;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}
	
	
}
