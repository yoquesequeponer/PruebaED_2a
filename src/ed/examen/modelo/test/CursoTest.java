package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Curso;
import ed.examen.modelo.Persona;

class CursoTest {
	Curso c = new Curso();
	@Test
	void testEliminarAlumno() {
		//Eliminar un alumno que no existe
				int tamanoAntes=c.numeroAlumnos();
				boolean exceptionlanzada=false;
				try {
					c.eliminarAlumno("000000000");
				} catch (Exception e) {
					exceptionlanzada=true;
				}
				int tamanoDesp=c.numeroAlumnos();
				assertFalse(exceptionlanzada);
				assertEquals(tamanoAntes, tamanoDesp);

				//Eliminar un alumno que existe
				c.aniadirAlumno(new Persona("123456789", "Alvaro", "Fernandez"));
				tamanoAntes=c.numeroAlumnos();
				exceptionlanzada=false;
				try {
					c.eliminarAlumno("123456789");
				} catch (Exception e) {
					exceptionlanzada=true;
				}
				tamanoDesp=c.numeroAlumnos();
				assertFalse(exceptionlanzada);
				assertEquals(tamanoAntes, tamanoDesp+1);
				
				//Parametro menor de 9 caracteres
				exceptionlanzada=false;
				try {
					c.eliminarAlumno("00");
				} catch (Exception e) {
					exceptionlanzada=true;
				}
				assertTrue(exceptionlanzada);
				
				//Parametro mas de 9 caracteres
				exceptionlanzada=false;
				try {
					c.eliminarAlumno("0000000000");
				} catch (Exception e) {
					exceptionlanzada=true;
				}
				assertTrue(exceptionlanzada);
	}

	@Test
	void testAniadirAlumno() {
		fail("Not yet implemented");
	}

	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}
	@Test
	void testCurso() {
			assertNotNull(c);
	}

}
