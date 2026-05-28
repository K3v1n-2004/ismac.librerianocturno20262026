package com.distribuida.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CategoriaTest {

    @Test
    public void testGettersYSettersCategoria() {
        Categoria categoria = new Categoria();

        // Asignación de nuevos nombres y descripciones
        categoria.setIdCategoria(2);
        categoria.setCategoria("Fantasía");
        categoria.setDescription("Libros de mitología, magia y mundos imaginarios");

        // Verificación de los datos encapsulados
        assertNotNull(categoria);
        assertEquals(2, categoria.getIdCategoria());
        assertEquals("Fantasía", categoria.getCategoria());
        assertEquals("Libros de mitología, magia y mundos imaginarios", categoria.getDescription());
    }
}
