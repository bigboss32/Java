

public class Pila {
	Nodo_pila cab;
    
    Pila(){
        cab=null;
    }
    
    public boolean isVacia(){
        return cab==null;
    }
    
    public void limpiar(){
        cab=null;
    }
    
    public String atender(){
    	String info=null;
        if(!isVacia()){
            info=cab.info;            
            cab=cab.sig;
        }
        return info;
    }
    
    
    public void insertar(Nodo_pila nuevo){
        if(!isVacia()){
            nuevo.sig=cab;            
        }
        cab=nuevo;
    }

    @Override
    public String toString() {
        String mostrar="";
        Nodo_pila tmp=cab;
        while(tmp!=null){
            mostrar+=tmp.info;
            tmp=tmp.sig;
        }
        return mostrar;
    }
    
    
    
}
