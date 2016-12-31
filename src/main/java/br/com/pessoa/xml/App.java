package br.com.pessoa.xml;

import javax.xml.bind.JAXB;
import br.com.pessoa.xml.entidade.PessoaFisica;


public class App 
{
    public static void main( String[] args )
    {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Fabio");
        pessoaFisica.setId(Long.valueOf(10));
        pessoaFisica.setCpf("689.300.381-15");
        
        JAXB.marshal(pessoaFisica, System.out);
    }
}
