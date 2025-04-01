package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor> {
	private String cargo;
	private int antiguedadDocente;
	
	// constructores 
	
	public Profesor ()
	{
		super();
		cargo = "sin cargo";
		antiguedadDocente = 0 ;
	}
	
	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente)
	{
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
	//set y get
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	

	
	@Override
	public String toString() {
		return super.toString() + ", CARGO: " + cargo + ", ANTIÜEDAD: " + antiguedadDocente;
	}

	@Override
	public int compareTo(Profesor p) {
		if (p.getAntiguedadDocente() == this.getAntiguedadDocente())
		{
			return 0;
		}
		if (p.getAntiguedadDocente()< this.getAntiguedadDocente())
		{
			return -1;
		}
		return 1;
	}


	
	
}
