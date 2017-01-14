package br.com.xml.gato;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXB;

public class GeradorXMLGato {

	public static void main(String[] args) {
		
		Gatos gatos = new Gatos();
		gatos.setGatos(new ArrayList<Gato>());
		
		Gato gato = new Gato();
		gato.setNome("Lindura");
		gato.setIdadeEmMeses(Long.valueOf(15));
		
		Gato gato2 = new Gato();
		gato2.setNome("Frida");
		gato2.setIdadeEmMeses(Long.valueOf(12));
		
		gatos.getGatos().add(gato);
		gatos.getGatos().add(gato2);

//		System.out.println(gatos.toString());
		JAXB.marshal(gatos, System.out);
	}

}
