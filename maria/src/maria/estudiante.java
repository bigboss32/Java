package maria;

public class estudiante {
	private String cc;
	private String nombre, pro,nombreemplea;
	

	public estudiante(String cc, String nombre, String pro,String nombreemplea ) {
		this.cc = cc;
		this.nombre = nombre;
		this.pro = pro;
		this.nombreemplea = nombreemplea;
	}


	public estudiante() {
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}
	

	public String getNombreemplea() {
		return nombreemplea;
	}


	public void setNombreemplea(String nombreemplea) {
		this.nombreemplea = nombreemplea;
	}


	@Override
	public String toString() {
		return "estudiante [cc=" + cc + ", nombre=" + nombre + ", pro=" + pro + ", nombreemplea=" + nombreemplea + "]";
	}


	

}
