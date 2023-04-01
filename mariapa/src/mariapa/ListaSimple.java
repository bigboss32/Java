package mariapa;



public class ListaSimple {

	Nodo cab;

	ListaSimple() {
		cab = null;
	}

	public boolean isVacia() {
		return (cab == null);
	}

	public void insertar(Nodo nuevo) {
		if (!isVacia()) {
			nuevo.setSig(cab);
			cab = nuevo;
		}
		cab = nuevo;
	}

	public int Impar(ListaSimple L1) {
		Nodo aux = L1.cab;
		int a = 0;
		if (!L1.isVacia()) {
			while (aux != null) { 
				if (aux.getInfo() % 2 != 0) {
					a++;
				}
				aux = aux.getSig();
			}
		}
		return a;
	}
	public int par(ListaSimple L1) {
		Nodo aux = L1.cab;
		int a = 0;
		if (!L1.isVacia()) {
			while (aux != null) { 
				if (aux.getInfo() % 2 == 0) {
					a++;
				}
				aux = aux.getSig();
			}
		}
		return a;
	}
	double promedio(ListaSimple L1){
		double v=0;
		Nodo aux = L1.cab;
		int a = 0;
		if (!L1.isVacia()) {
			while (aux != null) { 
				v=+aux.getInfo();
				a++;
			}
			aux = aux.getSig();
		}
		return v/a;
	}
	boolean leimianrpro(ListaSimple L1){
		Nodo aux = L1.cab;
		if (!L1.isVacia()) {
			while (aux != null) { 
				if (aux.getInfo()>promedio(L1)) {

				}
			}
			aux = aux.getSig();
		}

		return true;
	}

	public String toString() {
		String mostrar = "";
		int a=0;
		if (!isVacia()) {
			Nodo temp = cab;
			while (temp != null) {
				a++;Integer.toString(a);
				mostrar += a+")"+temp.getInfo() + "\n";
				temp = temp.getSig();
			}
		}
		return mostrar;
	}



}
