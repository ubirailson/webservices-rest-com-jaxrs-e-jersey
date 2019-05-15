package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Test;

import br.com.alura.loja.modelo.Projeto;
import junit.framework.Assert;

public class ProjetoTest extends SuperTest{

	@Test
	public void testBusca() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		Projeto projeto = target.path("/projetos/1").request().get(Projeto.class);
		
		Assert.assertEquals("Minha loja",projeto.getNome());
	}

}
