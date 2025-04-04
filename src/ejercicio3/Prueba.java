package ejercicio3;

public class Prueba implements IIntalacionDeportiva {
	
	private int tipoDeInstalacion;
	
	public Prueba() {}
	public Prueba (int tipoDeInstalacion)
	{
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}


	@Override
	public String toString() {
		return "Prueba Tipo de instalacion = " + tipoDeInstalacion;
	}



	@Override
	public int getTipoDeInstalaion() {
	
		return tipoDeInstalacion;
	}

}



