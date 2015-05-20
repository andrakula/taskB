package de.lustin.aufgabe.b;

import java.io.IOException;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

/**
 * Main class.
 * 
 */
public class StartB {

	public static void main(String[] args) {
		HttpServer server;
		try {
			/**
			 * start jersey server.
			 */
			server = HttpServerFactory.create("http://localhost:8042/");
			server.start();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
