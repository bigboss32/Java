
public class Nodo_cola {

	    casos info;
	    Nodo_cola sig;
	    
	    Nodo_cola(casos info){
	        this.info=info;
	        sig=null;
	    }

		@Override
		public String toString() {
			return "Nodo_cola [info=" + info + ", sig=" + sig + "]";
		}
	    
	    
	}


