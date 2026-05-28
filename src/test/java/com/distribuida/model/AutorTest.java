package com.distribuida.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AutorTest {

    @Test
    public void testGettersYSettersAutor() {
        Autor autor = new Autor();

        // Asignación de nuevos nombres y datos reales
        autor.setIdAutor(2);
        autor.setNombre("Joanne");
        autor.setApellido("Rowling");
        autor.setPais("Reino Unido");
        autor.setDireccion("Yate");
        autor.setTelefono("0987654321");
        autor.setCorreo("jkrowling@correo.com");

        // Verificación de los datos encapsulados
        assertNotNull(autor);
        assertEquals(2, autor.getIdAutor());
        assertEquals("Joanne", autor.getNombre());
        assertEquals("Rowling", autor.getApellido());
        assertEquals("Reino Unido", autor.getPais());
        assertEquals("Yate", autor.getDireccion());
        assertEquals("0987654321", autor.getTelefono());
        assertEquals("jkrowling@correo.com", autor.getCorreo());
    }
}