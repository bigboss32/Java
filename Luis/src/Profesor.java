
public class Profesor {
	String nombre;
	int id;
	LIsta_doble l;
	public Profesor(String nombre, int id, LIsta_doble l) {
		this.nombre = nombre;
		this.id = id;
		this.l = l;
	}
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", id=" + id + ", grupo=" + l.toString() + "]";
	}
	
}
