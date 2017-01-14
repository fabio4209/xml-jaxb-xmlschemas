package br.com.xml.gato;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gatos", propOrder = {"gatos"})

public class Gatos {

	@XmlElement(name="gato")
	private List<Gato> gatos = null;

	public List<Gato> getGatos() {
		return gatos;
	}

	public void setGatos(List<Gato> gatos) {
		this.gatos = gatos;
	}
	
	
	
}
