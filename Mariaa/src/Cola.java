 


public class Cola {
	Nodo_cola cab;
	Nodo_cola cola;

    public Cola() {
        cab =cola= null;        
    }
            
    public boolean isVacia() {
        return (cab == null);
    }

    public void insertar(Nodo_cola nuevo) {
        if (isVacia()) {
            cola = nuevo;
        }else{
            nuevo.sig=cab;
        }
        cab = nuevo;
    }
    
    public void limpiar(){
        cab=cola=null;
    }
            

    public casos atender(){
        casos retorno = null;
        if(!isVacia()){
            retorno=cab.info;
            if(cab==cola){                
                cab=cola=null;                
            }else{
                Nodo_cola tmp=cab;
                while(tmp.sig!=cola){
                    tmp=tmp.sig;
                }
                tmp.sig=null;
                cola=tmp;
            }            
            return retorno;
        }
        return retorno;
    }
    
    public int buscar(int dato){
        int pos=0;
        Nodo_cola tmp=cab;
        while(tmp!=null && (tmp.info.getCodigo()==dato)  ){
            tmp=tmp.sig;
            pos++;
        }
        if(tmp!=null){
            return pos;
        }
        return -1;
    }
        
    @Override
    public String toString() {
        String mostrar = "Cab->";
        Nodo_cola tmp = cab;
        while (tmp != null) {
            mostrar += tmp.info+"->";
            tmp = tmp.sig;
        }
        mostrar+="Null\n";
        int longitud =mostrar.length();
        for (int i = 0; i < longitud-5; i++) {
            mostrar+=" ";
        }
            mostrar+="^\n";
        for (int i = 0; i < longitud-5; i++) {
            mostrar+=" ";
        }
            mostrar+="|\n";
        for (int i = 0; i < longitud-5; i++) {
            mostrar+=" ";
        }
            mostrar+="Cola\n";        
        return mostrar;
    }

}
