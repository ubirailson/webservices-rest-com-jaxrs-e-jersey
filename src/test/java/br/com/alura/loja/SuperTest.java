package br.com.alura.loja;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;

public class SuperTest {

	private HttpServer server;
	
	@Before
	public void setUp() {
		server = Servidor.inicializaServidor();
	}
	
	@After
	public void tearDown() {
		server.stop();
		System.out.println("Servidor derrubado");
		
	}

}
