
public class estudiante {
	double nota1,nota2,nota3;
	String nombre, idet;
	

	
	public estudiante(double nota1, double nota2, double nota3, String nombre, String idet) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nombre = nombre;
		this.idet = idet;
	}
	public estudiante(String nombre, String idet) {
		this.nombre = nombre;
		this.idet = idet;
	}
	public estudiante() {
	}
	@Override
	public String toString() {
		return "estudiante [nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nombre=" + nombre + ", idet="
				+ idet + "]";
	}
	

}
