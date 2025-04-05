package ejercicio3;

public class Polideportivo extends Edificio implements IIntalacionDeportiva {

	private String nombre;
	private int tipoDeInstalacion;
	
	public Polideportivo(String nombre, int superficie, int tipoDeInstalacion) {
		super(superficie);
		this.nombre=nombre;
		this.tipoDeInstalacion=tipoDeInstalacion;
	}

	
	@Override
	public int getTipoDeInstalaion() {
		// TODO Auto-generated method stub
		return tipoDeInstalacion;
	}
	@Override
	public double getSuperficie() {
		// TODO Auto-generated method stub
		return super.getSuperficie();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Polideportivo [nombre= " + nombre + ", tipoDeInstalacion= " + tipoDeInstalacion + ", superficie= "+getSuperficie()+"]";
	}

}

