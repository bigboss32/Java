
public class Clientes {
private int cedula,nacimiento;
private String nombre,ciudad;

public Clientes(int cedula, int nacimiento, String nombre, String ciudad) {
	this.cedula = cedula;
	this.nacimiento = nacimiento;
	this.nombre = nombre;
	this.ciudad = ciudad;
}
public int getCedula() {
	return cedula;
}
public void setCedula(int cedula) {
	this.cedula = cedula;
}
public int getNacimiento() {
	return nacimiento;
}
public void setNacimiento(int nacimiento) {
	this.nacimiento = nacimiento;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCiudad() {
	return ciudad;
}
public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}
@Override
public String toString() {
	return "Clientes [cedula=" + cedula + ", nacimiento=" + nacimiento + ", nombre=" + nombre + ", ciudad=" + ciudad
			+ "]";
}

}
