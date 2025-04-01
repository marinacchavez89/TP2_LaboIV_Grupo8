package ejercicio1;

public class Profesor extends Empleado {
	private String cargo;
	private int antiguedadDocente;
	
	// constructores 
	
	public Profesor ()
	{
		super();
		cargo = "sin cargo";
		antiguedadDocente = 0 ;
	}
	
	public Profesor(String cargo, int antiguedadDocente)
	{
		super();
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
}
