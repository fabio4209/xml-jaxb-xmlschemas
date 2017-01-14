//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2017.01.07 �s 07:33:27 PM BRST 
//


package br.com.xml.pessoa.entidades;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PessoaFisica complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PessoaFisica">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pessoa.com.br/xml/entidade}Pessoa">
 *       &lt;sequence>
 *         &lt;element name="cpf" type="{http://www.pessoa.com.br/xml/entidade}CPF"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PessoaFisica", propOrder = {
    "cpf"
})
public class PessoaFisica
    extends Pessoa
{

    @XmlElement(required = true)
    protected String cpf;

    /**
     * Obtem o valor da propriedade cpf.
     * @return
     *     possible object is
     *     {@link String }
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

}
