
public class Ingeniero {
private int codigo;
private  String nombre ;
Pila pil= new Pila();

public Ingeniero() {
}
public Ingeniero(int codigo, String nombre) {
	this.codigo = codigo;
	this.nombre = nombre;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public String toString() {
	return "Ingeniero [codigo=" + codigo + ", nombre=" + nombre + "]";
}


}
