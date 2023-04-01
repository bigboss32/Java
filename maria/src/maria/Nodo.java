package maria;

public class Nodo {
    private estudiante info;
   private Nodo sig;
    
    Nodo(estudiante info){
        this.info=info;
        sig=null;
    }

	public estudiante getInfo() {
		return info;
	}

	public void setInfo(estudiante info) {
		this.info = info;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}

	@Override
	public String toString() {
		return "Nodo [info=" + info + "]";
	}
    
    
}
