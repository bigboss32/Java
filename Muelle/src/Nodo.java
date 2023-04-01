
public class Nodo {
Contenedor info;
Nodo sig,ant;

public Nodo(Contenedor info) {
	this.info = info;
	this.sig = null;
	this.ant = null;
}

@Override
public String toString() {
	return "Nodo [info=" + info + "]";
}

}
