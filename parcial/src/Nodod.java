 
public class Nodod {
    
    private String dato;
    private Nodod sig;
    private Nodod ant;

    public Nodod() {
    }

    public Nodod(String dato, Nodod sig, Nodod ant) {
        this.dato = dato;
        this.sig = sig;
        this.ant = ant;
    }

    public Nodod(String dato) {
//        this.dato = dato;
        this(dato,null, null);   
//        this.(dato, null, null);
    }
    
  

    public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public Nodod getSig() {
		return sig;
	}

	public void setSig(Nodod sig) {
		this.sig = sig;
	}

	public Nodod getAnt() {
		return ant;
	}

	public void setAnt(Nodod ant) {
		this.ant = ant;
	}

	@Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", sig=" + sig + ", ant=" + ant + '}';
    }
    
    
   
}
