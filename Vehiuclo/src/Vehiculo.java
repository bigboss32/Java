
public class Vehiculo {
private String destino;
private String vehiculo;
public Vehiculo(String destino, String vehiculo) {
	this.destino = destino;
	this.vehiculo = vehiculo;
}
public Vehiculo( String vehiculo) {
	this.destino = "oriente";
	this.vehiculo = vehiculo;
}
public Vehiculo() {
}

public String getDestino() {
	return destino;
}
public void setDestino(String destino) {
	this.destino = destino;
}
public String getVehiculo() {
	return vehiculo;
}
public void setVehiculo(String vehiculo) {
	this.vehiculo = vehiculo;
}
@Override
public String toString() {
	return "Vehiculo [destino=" + destino + ", vehiculo=" + vehiculo + "]";
}

}
