package mariapa;

public class Nodo {
    private int info;
   private Nodo sig;
    
    Nodo(int info){
        this.info=info;
        sig=null;
    }

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
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
