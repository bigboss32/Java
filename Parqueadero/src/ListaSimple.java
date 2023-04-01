
public class ListaSimple {
	Nodo cab;

	public boolean isVacia() {
		return (cab == null);
	}

	public void insertarCab(Nodo nuevo) {
		if (!isVacia()) {
			nuevo.sig = cab;
			cab = nuevo;
		}
		cab = nuevo;
	}
	public Nodo eliminarCola() {
		Nodo a=null;
		if (!isVacia()) {
			Nodo temp = cab;
			while (temp.sig.sig != null) {
				temp = temp.sig;
			}
			a=temp;
			temp.sig = null;
			return a;
		}

		return a;

	}
	public Nodo eliminarCab() {
		Nodo temp=cab;
		if (!isVacia()) {
			cab = cab.sig;
			return temp;
		}
		return temp;
	}
	public int contar() {
		int longitud = 0;
		if (!isVacia()) {
			Nodo temp = cab;
			while (temp != null) {
				longitud++;
				temp = temp.sig;
			}
		}
		return longitud;
	}

//	public Nodo eliminarD(int pos) {
//		Nodo a=null;
//		if(pos==0){
//			a=cab;
//			eliminarCab();
//			return a;
//		}else{
//			if (pos==contar()-1){
//				eliminarCola();
//			}else{
//				if (pos <= contar()) {
//
//					Nodo temp = cab;
//					for (int i = 0; i < pos; i++) {
//						temp = temp.sig;
//					}
//					a=temp;
//					cab.sig=temp.sig;
//					return a;
//				}
//			}
//		}
//
//
//		return a;
//	}
	public String toString() {
		String mostrar = "";
		int a=0;
		if (!isVacia()) {
			Nodo temp = cab;
			while (temp != null) {
				a++;Integer.toString(a);
				mostrar += a+")"+temp.info + "\n";
				temp = temp.sig;
			}
		}
		return mostrar;
	}
}
