
public class Persona {
	String prioridad,nombre;
	int codigo;
	
	public Persona() {
	}

	public Persona(String prioridad, String nombre, int codigo) {
		this.prioridad = prioridad;
		this.nombre = nombre;
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "prioridad: " + prioridad + " nombre: " + nombre + " codigo: " + codigo;
	}
	
	

}
