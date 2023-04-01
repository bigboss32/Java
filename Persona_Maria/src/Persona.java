 
public class Persona {
	private int cc,edad;
	private String nombre;
	private boolean genero;
	public Persona() {
		cc = 1233534;
		edad = 21;
		nombre = "maira";
		genero = true;
	}
	
	
	public Persona(int cc, int edad, String nombre, boolean genero) {
		this.cc = cc;
		this.edad = edad;
		this.nombre = nombre;
		this.genero = genero;
	}
	public int getCc() {
		return cc;
	}
	private void setCc(int cc) {
		this.cc = cc;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isGenero() {
		return genero;
	}
	public void setGenero(boolean genero) {
		this.genero = genero;
	} 
	public void setcc(int cc){
		setCc(cc);
	}
	public void setnombre(String nombre){
		setNombre(nombre);
	}


	@Override
	public String toString() {
		return "Persona [cc=" + cc + ", edad=" + edad + ", nombre=" + nombre + ", genero=" + genero + "]";
	}
	
	
	
}
