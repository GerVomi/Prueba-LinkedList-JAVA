package paquete;

import java.util.*;

public class Test {
	
	
	public static void main(String []args) {
	LinkedList <Persona> personas = new LinkedList<Persona>();
	
	Persona persona1 = new Persona("Julian",21);
	Persona persona2 = new Persona("Sebas",30);
	Persona persona3 = new Persona("Cristian",20);
	Persona persona4 = new Persona("Rosana",56);
	personas.add(persona1);
	personas.add(persona2);
	personas.add(persona3);
	personas.add(persona4);
	System.out.println(personas.size());
	
	for (Persona p : personas) {
		System.out.println(p);
	}
	
	
	
	}
}
