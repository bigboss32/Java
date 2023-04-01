package parcial;

public class Estudiante {
	String nombre;
	String apellido;
	String fecha;
	int genero;
	int idetificacion;
	public Estudiante(String nombre, String apellido, String fecha, int genero, int idetificacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha = fecha;
		this.genero = genero;
		this.idetificacion = idetificacion;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", fecha=" + fecha + ", genero=" + genero
				+ ", idetificacion=" + idetificacion + "]";
	}
	

	
	

}
