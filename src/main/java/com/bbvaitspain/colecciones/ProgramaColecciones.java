package com.bbvaitspain.colecciones;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ProgramaColecciones {
	public static void main(String[] args) {
		
		//Creamos Ordenador 1
		Ordenador ordenador1 = new Ordenador();
		ordenador1.setMarca("Pentium");
		ordenador1.setModelo("II 400Mhz");
		
		//Declaración de Piezas
		Pieza pieza1 = new Pieza();
		pieza1.setNombre("RAM");
		pieza1.setTipo("Hardware");
		//pieza1.setOrdenador(ordenador1);
		Pieza pieza2 = new Pieza("ROM","Hardware");
		Pieza pieza3 = new Pieza("Pantalla","Útiles");
		Pieza pieza4 = new Pieza("Tira RGB","Iluminación");
		Pieza pieza5 = new Pieza("Teclado","Útiles");
		Pieza pieza6 = new Pieza("Ratón","Útiles");
		
		//Damos piezas a Ordenador1
		ordenador1.getComponentes().add(pieza1);
		ordenador1.getComponentes().add(pieza2);
		ordenador1.getComponentes().add(pieza3);
		ordenador1.getComponentes().add(pieza4);

		//Creamos y damos piezas a ordenador2
		Ordenador ordenador2 = new Ordenador("Medion","GTX780",new HashSet<Pieza>());
		ordenador2.getComponentes().add(pieza1);
		ordenador2.getComponentes().add(pieza5);
		ordenador2.getComponentes().add(pieza6);
		
		System.out.println(ordenador1);
		System.out.println(ordenador2);
		
		//Nuevo(del profe)
		Map<String,String> cliente = new HashMap<String, String>();
        cliente.put("nombre", "Pepe");
        cliente.put("direccion","Mi calle");
        cliente.put("tlf", "9123456678");
        cliente.put("email","p@p.com");
        System.out.println(cliente);
        ArrayList<Map<String, String>> listadoMapa=
                new ArrayList<Map<String, String>>();
        listadoMapa.add(cliente);
        System.out.println(listadoMapa);
	}

}
