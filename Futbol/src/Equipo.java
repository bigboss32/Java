
public class Equipo {
	private String nombre;
	private Jugador a[] =new Jugador[11];
	Jugador equipo (){
		Jugador b = new Jugador();
		for (int j = 0; j < a.length; j++) {
			a[j]=b;	
		}
		for (int i = 0; i < a.length; i++) {
			return a[i];
		}
		return b;

	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Jugador[] getA() {
		return a;
	}
	public void setA(Jugador[] a) {
		this.a = a;
	} 


}
