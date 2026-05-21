package com.distribuida;

import com.distribuida.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);
		System.out.println("HOLA MUNDO DESDE SPRIMG BOOT");
		Cliente cliente = new Cliente(
				1
				,"172846300"
				,"Alan"
				,"Brito"
				,"Quito"
				,"0986521915"
				,"abrito@correo.com"

				);

		System.out.println(cliente.toString());
	}


}
