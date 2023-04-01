
public class Clases extends Personaje{
	private String nombre="";

	public Clases(String nombre,int fuerza, int agilidad, int inteligencia) {
		atributos(fuerza, agilidad, inteligencia);
		this.nombre = nombre;
	}

	@Override
	void atributos(int fuerza, int agilidad, int inteligencia) {
		super.atributos(fuerza, agilidad, inteligencia);
	}

	public Clases() {

	}

	public void Clases(String nombre,int fuerza, int agilidad, int inteligencia) {
		atributos(fuerza, agilidad, inteligencia);
		this.nombre = nombre;
	}

	Clases heroeala(String nombre){
		Clases m =new Clases(nombre, fuerza=(int)(Math.random() *100 ) ,
				agilidad=(int)(Math.random() *100) , inteligencia=(int)(Math.random() *100) );
		return m;
	}
	int heroeala(){
		int a=(int)(Math.random() *4+1);
		return a;
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + " fuerza=" + fuerza + " agilidad=" + agilidad + " inteligencia="
				+ inteligencia ;
	}






}
