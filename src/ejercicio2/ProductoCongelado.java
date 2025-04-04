package ejercicio2;

public class ProductoCongelado extends Producto{
	private double temperaturaRecomendada;

	public ProductoCongelado(String fechaCaducidad, int numeroLote, double temperaturaRecomendada) {
		super(fechaCaducidad, numeroLote);
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	public double getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}

	public void setTemperaturaRecomendada(double temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	@Override
	public String toString() {
		return "Producto Congelado [temperaturaRecomendada=" + temperaturaRecomendada  
				+ super.toString() + "]";
	}
	
}
