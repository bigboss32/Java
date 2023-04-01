package parcial;

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
//	public int buscar(String dato,double a,double b,double c){
//		int pos=0;
//		Nodo tmp=cab;
//		while(tmp!=null && tmp.info.idet.equals(dato) ){
//			tmp.info.nota1=a;
//			tmp.info.nota2=b;
//			tmp.info.nota3=c;
//			tmp=tmp.sig;
//			pos++;
//		}
//		if(tmp!=null){
//			return pos+1;
//		}
//		return -1;
//	}
//	public int buscar(String dato){
//		int pos=0;
//		Nodo tmp=cab;
//		while(tmp!=null && tmp.info.idet.equals(dato) ){
//			tmp=tmp.sig;
//			pos++;
//		}
//		if(tmp!=null){
//			return pos+1;
//		}
//		return -1;
//	}
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
