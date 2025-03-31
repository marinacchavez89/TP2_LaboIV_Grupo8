package ejercicio1;

public class Empleado {
	
	private final int id;
	private String nombre;
	private int edad;
	
	// Variable de la clase y no de los objetos
	private static int cont = 1000;
	
	// Primer constructor
	public Empleado() {
	 this.id = cont++;
	 this.nombre = "sin nombre";
	 this.edad = 99;
	}
	
	// Segundo constructor (recibe nombre y edad como parámetros)
	public Empleado(String nombre, int edad) {
		this.id = cont++; // Se mantiene el autoincremento del id
		this.nombre = nombre;
		this.edad = edad;
	}	
	
	public int getId() {
		return id;
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
	
	public static int devuelveProximoID(int idAnterior) {
		int idProximo;
		idAnterior++;
		idProximo = idAnterior;
		return idProximo;
	}

	@Override
	public String toString() {
		return "Empleado ID: " + id + ", NOMBRE: " + nombre + ", EDAD: " + edad;
	}
}
