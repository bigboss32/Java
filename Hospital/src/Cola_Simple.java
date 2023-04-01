
public class Cola_Simple {
	 Nodo cab;
	 int tam;
	    
	    public Cola_Simple() {
	    	   cab=null;		}
	    
	    
	    public boolean isVacia(){
	        return cab==null;
	    }
	    
	    public void limpiar(){
	        cab=null;
	    }
	    
	    public Paciente atender(){
	        Paciente info=null;
	        Nodo tmp=cab;
	        if(!isVacia()){
	            if(tmp.sig!=null){
	                while(tmp.sig.sig!=null){
	                    tmp=tmp.sig;
	                }
	                info=tmp.sig.info;
	                tmp.sig=null;
	                return info;                
	            }
	            info=tmp.info;
	            cab=null;
	            return info;
	        }        
	        return info;
	    }
	   
	    
	    public void insertar(Nodo nuevo){
	        if(!isVacia()){
	            nuevo.sig=cab;            
	        }
	        cab=nuevo;
	        tam++;
	    }
	    
	    public int buscar(int dato){
	        int pos=0;
	        Nodo tmp=cab;
	        while(tmp!=null && !(tmp.info.codigo==dato)){
	            tmp=tmp.sig;
	            pos++;
	        }
	        if(tmp!=null){
	            return pos;
	        }
	        return -1;
	    }
	    public void inserta_paciente(String nombre,int cc,int codigo){
	    	Paciente a=new Paciente(nombre,cc,codigo);
	    	insertar(new Nodo(a));
	    }
	    public void inserta_paciente(String nombre){
	    	Paciente a=new Paciente(nombre);
	    	insertar(new Nodo(a));
	    }

	    @Override
	    public String toString() {
	        String mostrar="";
	        Nodo tmp=cab;
	        while(tmp!=null){
	            mostrar+="->"+tmp.info;
	            tmp=tmp.sig;
	        }
	        return mostrar;
	    }
	    
	    
}
