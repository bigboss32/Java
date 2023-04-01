
public class casos {
	private int codigo;
	private String decripcion;
	public casos() {
	}
	public casos(int codigo, String decripcion) {
		this.codigo = codigo;
		this.decripcion = decripcion;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDecripcion() {
		return decripcion;
	}
	public void setDecripcion(String decripcion) {
		this.decripcion = decripcion;
	}
	@Override
	public String toString() {
		return "casos [codigo=" + codigo + ", decripcion=" + decripcion + "]";
	}

}
