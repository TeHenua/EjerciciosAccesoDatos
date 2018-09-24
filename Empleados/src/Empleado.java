
public class Empleado {
	private String nombre;
	private int edad;
	private Departamento departamento;
	
	
	
	public Empleado() {}
	
	public Empleado(String nombre, int edad, Departamento departamento) {
		this.nombre = nombre;
		this.edad = edad;
		this.departamento = departamento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
}
