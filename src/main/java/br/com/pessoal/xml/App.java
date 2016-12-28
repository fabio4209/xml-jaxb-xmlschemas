package br.com.pessoal.xml;

import br.com.pessoal.pessoaxmlschema.PessoaFisica;
import javax.xml.bind.JAXB;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Fabio");
        pessoaFisica.setCpf("689.300.381-15");
        
    }
}
