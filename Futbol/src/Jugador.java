
public class Jugador {
	private String nombre,poscion;
	private int numero;
	public Jugador() {
		nombre = "carlitos";
		poscion = "delantero";
		numero = 23;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPoscion() {
		return poscion;
	}
	public void setPoscion(String poscion) {
		this.poscion = poscion;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", poscion=" + poscion + ", numero=" + numero + "]";
	}


}
