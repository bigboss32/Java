package maria;



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

    public void insertarCola(Nodo nuevo) {
        if (isVacia()) {
            cab = nuevo;
        } else {
            Nodo tmp = cab;
            while (tmp.getSig() != null) {
                tmp = tmp.getSig();
            }
            tmp.setSig(nuevo);
        }
    }
    public int buscar(String dato){
        int pos=0;
        Nodo tmp=cab;
        while(tmp!=null && !(tmp.getInfo().getCc().equalsIgnoreCase(dato))){
            tmp=tmp.getSig();
            pos++;
        }
        if(tmp!=null){
            return pos+1;
        }
        return -1;
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
