package ejercicio3;

public class mainEjercicio3 {

	public static void main(String[] args) {
		
		/**Prueba prueba1 = new Prueba(1);
		Prueba prueba2 = new Prueba(2);
		Prueba prueba3 = new Prueba(3);
		
		System.out.println("Prueba 1 - tipo : "+ prueba1.getTipoDeInstalacion());
		System.out.println("Prueba 2 - tipo : "+ prueba2.getTipoDeInstalacion());
		System.out.println("Prueba 3 - tipo : "+ prueba3.getTipoDeInstalacion());*/
		
        /*Polideportivo poli1 = new Polideportivo("Poli Central", 1500, 1);
        Polideportivo poli2 = new Polideportivo("Poli Rincon", 2300, 2);

        System.out.println(poli1);
        System.out.println(poli2);

        System.out.println("Tipo de instalación de polideportivo: " + poli1.getTipoDeInstalaion());
        System.out.println("Superficie de polideportivo: " + poli2.getSuperficie());*/
        
        // Prueba de clase EdificioOficinas
        EdificioOficinas ediOficina = new EdificioOficinas(1500, 12);      
        System.out.println(ediOficina.toString());
        

	}

}
