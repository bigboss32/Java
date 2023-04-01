
public class Cola_doble {
	 Nodo cab, cola;

	    Cola_doble() {
	        cab = null;
	    }

	    public boolean isVacia() {
	        return cab == null;
	    }

	    public void limpiar() {
	        cab = cola = null;
	    }

	    public Persona atender() {
	        Persona info;
	        if (!isVacia()) {
	            info = cola.info;
	            if (cab == cola) {                
	                limpiar();                
	            } else {
	                cola = cola.ant;
	                cola.sig = null;
	            }
	            return info;
	        }
	        return null;
	    }

	    public void insertar(Nodo nuevo) {
	        if (isVacia()) {
	            cola = nuevo;
	        } else {
	            nuevo.sig = cab;
	            cab.ant = nuevo;
	        }
	        cab = nuevo;
	    }

	    @Override
	    public String toString() {
	        String mostrar = "";
	        Nodo tmp = cab;
	        while (tmp != null) {
	            mostrar += tmp.info;
	            tmp = tmp.sig;
	        }
	        return mostrar;
	    }
}
