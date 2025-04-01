package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
		
        Profesor p1 = new Profesor("Susana", 44, "Profesora de Economía", 10);
        Profesor p2 = new Profesor("Carlos", 45, "Profesor de Matemáticas", 10);
        Profesor p3 = new Profesor("Lucía", 38, "Profesora de Historia", 7);
        Profesor p4 = new Profesor("Juan", 50, "Profesor de Física", 15);
        Profesor p5 = new Profesor("Ana", 42, "Profesora de Biología", 12);
        
        listaProfesores.add(p1);
        listaProfesores.add(p2);
        listaProfesores.add(p3);
        listaProfesores.add(p4);
        listaProfesores.add(p5);
        

        Iterator<Profesor> iterador = listaProfesores.iterator();
        while (iterador.hasNext()) {
            //System.out.println(iterador.next());
        	Profesor profesor = iterador.next(); // Guardamos el objeto en una variable
            System.out.println(profesor.toString()); // Mostramos el objeto
        
        
	}

}
}