package ejercicio3;

public class EdificioOficinas extends Edificio {
	
	private int numeroOficinas;
	
	public EdificioOficinas(){		
		super(0);		
		numeroOficinas = 0;
	}
	
	public EdificioOficinas(int superficie, int numeroOficinas) {
		super(superficie);
		this.numeroOficinas = numeroOficinas;
	}

	public int getNumeroOficinas() {
		return numeroOficinas;
	}

	public void setNumeroOficinas(int numeroOficinas) {
		this.numeroOficinas = numeroOficinas;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " con " + numeroOficinas + " oficinas.";
	}
}
