package test.com.itulabs.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itulabs.modelo.Actor;

class ActorTest {

	@Test
	void testConstructorAndGetters() {
		Actor actor = new Actor("Juan Perez", 35, "Argentina");
		assertEquals("Juan Perez", actor.getNombre());
		assertEquals(35, actor.getEdad());
		assertEquals("Argentina", actor.getNacionalidad());
	}

	@Test
	void testSetters() {
		Actor actor = new Actor("", 0, "");
		actor.setNombre("Ana Lopez");
		actor.setEdad(28);
		actor.setNacionalidad("Chile");
		assertEquals("Ana Lopez", actor.getNombre());
		assertEquals(28, actor.getEdad());
		assertEquals("Chile", actor.getNacionalidad());
	}

	@Test
	void testValoresLimite() {
		Actor actor = new Actor("", -1, null);
		assertEquals("", actor.getNombre());
		assertEquals(-1, actor.getEdad());
		assertNull(actor.getNacionalidad());
	}
}
