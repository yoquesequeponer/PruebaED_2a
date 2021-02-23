package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Persona;

class PersonaTest {
	Persona p = new Persona("12345678A", "Alvaro", "Fernandez");

	@Test
	void testPersonaStringStringString() {
		assertNotNull(p);
		assertEquals("12345678A", p.getDni());
		assertEquals("Alvaro", p.getNombre());
		assertEquals("Fernandez", p.getApellido1());
	}

	@Test
	void testGetDni() {
		assertEquals("12345678A", p.getDni());
	}

	@Test
	void testSetDni() {
		// Bien hecho
		try {
			p.setDni("00000000A");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("00000000A", p.getDni());

		// Mal hecho
		boolean exceptionLanzada = false;
		try {
			p.setDni("000000000");
		} catch (Exception e) {
			exceptionLanzada = true;
		}
		assertTrue(exceptionLanzada);// assertEquals(true,exceptionLanzada);
	}

	@Test
	void testGetNombre() {
		assertEquals("Alvaro", p.getNombre());
	}

	@Test
	void testSetNombre() {
		p.setNombre("pedro");
		assertEquals("pedro", p.getNombre());
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
