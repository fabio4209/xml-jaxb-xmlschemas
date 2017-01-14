package br.com.xml.pessoa;

import java.io.File;

import javax.xml.bind.JAXB;

import br.com.xml.pessoa.entidades.PessoaFisica;

public class PessoaUnmarshaller {

	public static void main(String[] args) {
		converterXMLPessoaParaObjeto();
	}
	
	private static void converterXMLPessoaParaObjeto(){
		File arquivoXML = 
				new File("src\\main\\resources\\PessoaXML.xml");
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica = JAXB.unmarshal(arquivoXML, PessoaFisica.class);
	}

}
