package ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		
        ProductoFresco fresco = new ProductoFresco(
        		"31/12/2025", 101, "15/01/2025", "Argentina");
        ProductoRefrigerado refrigerado = new ProductoRefrigerado(
        		"30/11/2025", 202, "RNE N°02-456187");
        ProductoCongelado congelado = new ProductoCongelado(
        		"20/05/2026", 303, -12);

        System.out.println(fresco);
        System.out.println(refrigerado);
        System.out.println(congelado);
		

	}

}

