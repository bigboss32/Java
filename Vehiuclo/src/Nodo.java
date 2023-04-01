
public class Nodo {
Vehiculo info;
Nodo ant,sig;
public Nodo(Vehiculo info) {
	this.info = info;
	this.ant = null;
	this.sig = null;
}
@Override
public String toString() {
	return "Nodo [info=" + info + "]";
}


}
