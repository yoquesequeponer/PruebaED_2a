package ed.examen.modelo;

/**
 * @author Alvaro Fernandez Liberal
 *
 **/
public class Persona {

	private String dni;
	private String nombre;
	private String apellido1;

	public Persona() {}

	/**
	 * Metodo para crear una persona
	 * 
	 * @param dni       es el identificador de la persona
	 * @param nombre    es el nombre de la persona
	 * @param apellido1 es el primer apellido de la persona
	 **/
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	/**
	 * Metodo que devuelve un DNI del tipo String
	 * 
	 * @return String
	 **/
	public String getDni() {
		return dni;
	}

	/**
	 * Metodo que cambia un dni
	 * 
	 * @param dni es el nuevo dni
	 * @throws Exception Cuando el ultimo caracter no es una letra
	 **/
	public void setDni(String dni) throws Exception {
		// comprobacion de si el ultimo caracter es una letra
		if (Character.isLetter(dni.charAt(dni.length() - 1))) {
			this.dni = dni;
		} else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}

	/**
	 * Metodo que devuelve el nombre de la persona
	 * 
	 * @return String
	 **/
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que cambia el nombre de una persona
	 * 
	 * @param nombre es el nuevo nombre
	 **/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que devuelve el apellido de la persona
	 * 
	 * @return String
	 **/
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Metodo que cambia el apellido de la persona
	 * 
	 * @param apellido1 appelido nuevo
	 **/
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
