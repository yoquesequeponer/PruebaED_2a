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
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
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
