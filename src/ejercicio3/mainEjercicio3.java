package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

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
        //EdificioOficinas ediOficina = new EdificioOficinas(1500, 12);      
        //System.out.println(ediOficina.toString());
        
		ArrayList<Edificio> listaPoliYEdiOficinas = new ArrayList<>();
		
		Edificio poli1 = new Polideportivo("Poli Centro", 1200, 1);
		Edificio poli2 = new Polideportivo("Poli Norte", 1000, 2);
		Edificio poli3 = new Polideportivo("Poli Sur", 999, 3);
		
		listaPoliYEdiOficinas.add(poli1);
		listaPoliYEdiOficinas.add(poli2);
		listaPoliYEdiOficinas.add(poli3);
		
		Edificio ediOfi1 = new EdificioOficinas(1200, 17);
		Edificio ediOfi2 = new EdificioOficinas(1000, 22);
		Edificio ediOfi3 = new EdificioOficinas(999, 37);
		
		listaPoliYEdiOficinas.add(ediOfi1);
		listaPoliYEdiOficinas.add(ediOfi2);
		listaPoliYEdiOficinas.add(ediOfi3);
		
		ListIterator<Edificio> it = listaPoliYEdiOficinas.listIterator();
		
		while(it.hasNext()) {
			Edificio edificio = it.next();
			it.remove();
			System.out.println(edificio.toString());
		}
	}

}
