
public class Paciente {
	String nombre;
	int cc,codigo;
	public Paciente(String nombre, int cc, int codigo) {
		this.nombre = nombre;
		this.cc = cc;
		this.codigo = codigo;
	}
	public Paciente(String nombre) {
		this.nombre = nombre;
	}
	public Paciente() {
	}
	@Override
	public String toString() {
		return "Paciente [nombre:" + nombre + " cc:" + cc + " prioridad:" + codigo ;
	}

}
