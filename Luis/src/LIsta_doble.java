
public class LIsta_doble {

	Nodo cab, fin; 
	int tam=0;
	LIsta_doble() { 
		cab = fin = null; 
		tam=0;
	} 
	
	void agregarFinal (Nodo n) {
		tam++;
		n.sig = null; 
		if (cab == null) 
			cab = n; 
		else { 
			n.ant = fin; 
			fin.sig = n; 
		} 
		fin = n; 
	} 
	void agregarPrincipio (Nodo n) { 
		tam++;
		n.ant = null; 
		if (cab == null) 
			fin = n; 
		else { 
			n.sig = cab; 
			cab.ant = n; 
		} 
		cab = n; 
	}
	public void intercambiar (int pos1, int pos2) {
		if (pos1 <= cantidad () && pos2 <= cantidad ())    {
			Nodo reco1 = cab;
			for (int f = 1 ; f < pos1 ; f++)
				reco1 = reco1.sig;
			Nodo reco2 = cab;
			for (int f = 1 ; f < pos2 ; f++)
				reco2 = reco2.sig;
			Estudiante aux = reco1.dato;
			reco1.dato = reco2.dato;
			reco2.dato = aux;
		}
	}
	public int cantidad ()
	{
		int cant = 0;
		Nodo reco = cab;
		while (reco != null) {
			reco = reco.sig;
			cant++;
		}
		return cant;
	}
	void eliminar (Nodo n) { 
		if (n == cab) 
			cab = n.sig; 
		else 
			if (n == fin) 
				fin = fin.ant; 
			else { 
				n.ant.sig = n.sig; 
				n.sig.ant = n.ant; 
			} 
	}
	public boolean BuscarElementoEsp (int elemento,int notauno,int notados,int nota3){
		Nodo temporal=cab;
		boolean v=false;
		while (temporal!=null&&temporal.dato.nit!=elemento)
		{
			temporal=temporal.sig;
		}
		if (temporal!=null) {

			temporal.dato.nota1=notauno;
			temporal.dato.nota2=notados;
			temporal.dato.nota3= nota3;
			temporal.dato.notas();
			v=true;
		}
		return v;
	}
	public String BuscarElementoEsp (int elemento){
		Nodo temporal=cab;
		String v=null;
		while (temporal!=null&&temporal.dato.nit!=elemento)
		{
			temporal=temporal.sig;
		}
		if (temporal!=null) {
			v=temporal.dato.toString();


		}
		return v;
	}
	
	public void actualizar (int elemento,String nombre){
		Nodo temporal=cab;
	
		while (temporal!=null&&temporal.dato.nit!=elemento)
		{
			temporal=temporal.sig;
		}
		if (temporal!=null) {
			temporal.dato.nombre=nombre;
		}
		
	}






	public boolean isVacia() {
		return (cab == null);
	}
	public String toString() {
		String mostrar = "";
		int a=0;
		if (!isVacia()) {
			Nodo temp = cab;
			while (temp != null) {
				a++;Integer.toString(a);
				mostrar += a+")"+temp.dato + "\n";
				temp = temp.sig;
			}
		}
		return mostrar;
	}
	public void elimnartodo() {
		cab = fin = null; 		
	}
}
