 


public class Lista {
	Nodo_lista cab;

    public Lista() {
        cab = null;
    }
    
    public int longitud(){
        int tam=0;
        Nodo_lista tmp=cab;
        while(tmp!=null){
            tam++;
            tmp=tmp.sig;
        }
        return tam;
    }

    public boolean isVacia() {
        return (cab == null);
    }

    public void insertar(Nodo_lista nuevo) {
        if (!isVacia()) {
            nuevo.sig = cab;
        }
        cab = nuevo;
    }
    
    public void insertarCola(Nodo_lista nuevo){
        if(!isVacia()){
        	Nodo_lista tmp=cab;
            while(tmp.sig!=null){
                tmp=tmp.sig;
            }
            tmp.sig=nuevo;
        }else{
           cab=nuevo;
        }        
    }
    
    public boolean insertarPos(Nodo_lista nuevo, int pos){        
        if(pos==0){
            insertar(nuevo);
            return true;
        }else if(pos<=longitud()){
        	Nodo_lista tmp=cab;
            for(int i=1;i<pos;i++){
                tmp=tmp.sig;
            }
            nuevo.sig=tmp.sig;
            tmp.sig=nuevo;
            return true;
        }        
        return false;
    }
    
    public boolean eliminar(int pos){
        if(!isVacia() && pos<longitud()){
            if(pos==0){return eliminarCabeza();}
            Nodo_lista tmp=cab;
            for(int i=1;i<pos;i++){
                tmp=tmp.sig;
            }            
            tmp.sig=tmp.sig.sig;
            return true;
        }
        return false;
    }
    
    public Nodo_lista getNodo(int pos){
        if(!isVacia() && pos<longitud()){
        	Nodo_lista tmp=cab;
            for(int i=0;i<pos;i++){
                tmp=tmp.sig;
            }                        
            return tmp;
        }
        return null;
    }
    
    public int buscar(int dato){
        int pos=0;
        Nodo_lista tmp=cab;
        while(tmp!=null && tmp.info.getCodigo() !=dato){
            tmp=tmp.sig;
            pos++;
        }
        if(tmp!=null){
            return pos;
        }
        return -1;
    }
    
    public boolean eliminarCabeza(){        
        cab=cab.sig;
        return true;
    }
    
    @Override
    public String toString() {
        String mostrar = "Cab-> ";
        Nodo_lista tmp = cab;
        while (tmp != null) {
            mostrar += tmp.info + " -> ";
            tmp = tmp.sig;
        }
        return mostrar+"null";
    }

}
