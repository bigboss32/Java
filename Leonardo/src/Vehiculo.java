
public class Vehiculo {
String placa,tipo;
int numerointerno;
boolean salio;
public Vehiculo(String placa, String tipo, int numerointerno,boolean d) {
	this.placa = placa;
	this.tipo = tipo;
	this.numerointerno = numerointerno;
	this.salio=d;
}
public Vehiculo(String placa, String tipo, int numerointerno) {
	this.placa = placa;
	this.tipo = tipo;
	this.numerointerno = numerointerno;
}
@Override
public String toString() {
	return "placa:" + placa + " tipo:" + tipo + " Numero interno:" + numerointerno +"f "+salio; 
}



}
