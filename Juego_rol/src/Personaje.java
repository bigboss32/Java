
public class Personaje {
	int fuerza=0,agilidad=0,inteligencia=0;
	
	
	public Personaje() {
	
	}
	void atributos(int fuerza, int agilidad, int inteligencia){
		this.fuerza = fuerza;
		this.agilidad = agilidad;
		this.inteligencia = inteligencia;
	
	}
	@Override
	public String toString() {
		return "Personaje [fuerza=" + fuerza + ", agilidad=" + agilidad + ", inteligencia=" + inteligencia + "";
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getAgilidad() {
		return agilidad;
	}
	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	


}
