
public class Persona {
String nombre;
int cc,codigo;
public Persona() {
}
public Persona(String nombre, int cc, int codigo) {
	this.nombre = nombre;
	this.cc = cc;
	this.codigo = codigo;
}
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", cc=" + cc + ", codigo=" + codigo + "]";
}


}
