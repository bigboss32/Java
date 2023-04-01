
public class Nodo {
estudiante info;
Nodo sig;
public Nodo() {

}
public Nodo(estudiante info) {
	this.info = info;
	this.sig=null;
}

public String toString() {
	return " [info=" + info + "]";
}
}
