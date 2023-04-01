package parcial;

public class Nodo {
	Estudiante info;
Nodo sig;
public Nodo() {

}
public Nodo(Estudiante info) {
	this.info = info;
	this.sig=null;
}

public String toString() {
	return " [info=" + info + "]";
}
}
