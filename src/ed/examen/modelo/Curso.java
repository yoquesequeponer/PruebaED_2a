package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alvaro Fernandez Liberal
 *
 **/
public class Curso {
	
	private List<Persona> listaAlumnos;

	
	/**
	 * Metodo que elimina un alumno a partir de su dni
	 * @param dni es el identificador de la persona
	 * @throws Exception si la longitud no es la correcta
	 **/
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	
	/**
	 * Metodo que aniade un alumno al curso
	 * @param p es la perdona a aniadir
	 **/
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	
	/**
	 * Metodo que comprueba si un alumno esta registrado
	 * @param dni es el identificador de la persona
	 * @return boolean
	 **/
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	
	/**
	 * Metodo que inicializa el curso
	 **/
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	

	/**
	 * Metodo que devuelve el numero de alumnos
	 * @return Integer
	 **/
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
