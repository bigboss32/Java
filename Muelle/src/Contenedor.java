
public class Contenedor {
	private boolean carga;
	private String codigo;
	
	public Contenedor(boolean carga, String codigo) {
		this.carga = carga;
		this.codigo = codigo;
	}
	
	public Contenedor() {
	}
	
	

	public boolean isCarga() {
		return carga;
	}

	public void setCarga(boolean carga) {
		this.carga = carga;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Contenedor[carga:" + carga + " codigo:" + codigo +"]";
	}

}
