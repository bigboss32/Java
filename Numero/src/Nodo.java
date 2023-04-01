
public class Nodo {
int info;
Nodo sig;
public Nodo() {

}
public Nodo(int info) {
	this.info = info;
	this.sig=null;
}

public String toString() {
	return " [info=" + info + "]";
}
}
