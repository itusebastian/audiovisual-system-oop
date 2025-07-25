package test.com.itulabs.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itulabs.modelo.Documental;
import com.itulabs.modelo.Investigador;

class DocumentalTest {

	@Test
	void testConstructorAndGetters() {
		Documental doc = new Documental("Doc1", 60, "Historia", "Egipto");
		assertEquals("Doc1", doc.getTitulo());
		assertEquals(60, doc.getDuracionEnMinutos());
		assertEquals("Historia", doc.getGenero());
		assertEquals("Egipto", doc.getTema());
		assertNotNull(doc.getInvestigadores());
		assertTrue(doc.getInvestigadores().isEmpty());
	}

	@Test
	void testAgregarInvestigador() {
		Documental doc = new Documental("Doc2", 45, "Ciencia", "Física");
		Investigador inv = new Investigador("Ana", "Física");
		doc.agregarInvestigador(inv);
		assertEquals(1, doc.getInvestigadores().size());
		assertEquals(inv, doc.getInvestigadores().get(0));
	}

	@Test
	void testSetTema() {
		Documental doc = new Documental("Doc3", 30, "Arte", "Pintura");
		doc.setTema("Escultura");
		assertEquals("Escultura", doc.getTema());
	}
}
