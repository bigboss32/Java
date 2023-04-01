
public class Nodo {
String info;
Nodo sig;
public Nodo() {

}
public Nodo(String info) {
	this.info = info;
	this.sig=null;
}

public String toString() {
	return " [info=" + info + "]";
}
}
