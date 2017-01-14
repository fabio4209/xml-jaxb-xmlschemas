package br.com.xml.pessoa;

import java.io.File;

import javax.xml.bind.JAXB;

import br.com.xml.pessoa.entidades.PessoaFisica;

public class GeradorXMLPessoa {

	public static void main(String[] args) {
		criarXMLUtilizandoSchema();
	}

	private static void criarXMLUtilizandoSchema() {
		PessoaFisica pessoaFisica = criarPessoaFisica();
        JAXB.marshal(pessoaFisica, System.out);
	}

	private static PessoaFisica criarPessoaFisica() {
		PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Fabio");
        pessoaFisica.setId(Long.valueOf(10));
        pessoaFisica.setCpf("689.300.381-15");
		return pessoaFisica;
	}
	
}
