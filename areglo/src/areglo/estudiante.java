package areglo;

public class estudiante implements Comparable<estudiante>{
	private int ide;
	private double pro;
	private String nombre;

	public estudiante(int ide, double pro, String nombre) {
		this.ide = ide;
		this.pro = pro;
		this.nombre = nombre;
	}


	
	@Override
	public int compareTo(estudiante o) {
		if (pro < o.pro) {
			return -1;
		}
		if (pro > o.pro) {
			return 1;
		}
		return 0;
	}
	
	static void imprime (estudiante[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println((i+1) + ". " + array[i].getNombre() + " - Altura: " + array[i].getPro() + " - Edad: " + array[i].getIde());
		}}
	

  
	public int getIde() {
		return ide;
	}

	public void setIde(int ide) {
		this.ide = ide;
	}


	public double getPro() {
		return pro;
	}

	public void setPro(double pro) {
		this.pro = pro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "estudiante [ide=" + ide + ", pro=" + pro + ", nombre=" + nombre + "]";
	}

}
