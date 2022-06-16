package app;
public class Persona {
	
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public void cumpleanos() {
		this.edad++;
		System.out.println(this.edad);
	}
	
	public void datosPersona() {
		System.out.println(this.nombre);
		System.out.println(this.apellidos);
		System.out.println(this.edad);
	}
}