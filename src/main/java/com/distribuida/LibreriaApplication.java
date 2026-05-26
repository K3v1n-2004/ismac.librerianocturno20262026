package com.distribuida;

import com.distribuida.model.Autor;
import com.distribuida.model.Categoria;
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

		// 2. Instancia de Autor usando los campos reales de tu base de datos
		Autor autor = new Autor(1, "Gabriel", "García Márquez", "Colombia", "Aracataca", "099999999", "gabito@correo.com");
		System.out.println(autor.toString());

		// 3. Instancia de Categoría usando los campos reales de tu base de datos
		Categoria categoria = new Categoria(1, "Novela", "Libros de narrativa de ficción extensos");
		System.out.println(categoria.toString());
	}


}
