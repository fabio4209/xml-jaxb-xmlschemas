package br.com.xml.gato;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gato", propOrder = {"idadeEmMeses"})
public class Gato {
	
	@XmlElement(required = true)
	protected Long idadeEmMeses;
    @XmlAttribute(name = "nome")
    protected String nome;
    
    //idadeEmMeses
	public Long getIdadeEmMeses() {
		return idadeEmMeses;
	}
	public void setIdadeEmMeses(Long idadeEmMeses) {
		this.idadeEmMeses = idadeEmMeses;
	}
	
	//nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
    
    

}
