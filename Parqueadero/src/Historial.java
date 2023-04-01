import javax.swing.JTextArea;

public class Historial{
	Historial(){
		
	}
	synchronized void histo(ListaSimple x, Auto a[],int pos){
		x.insertarCab(new Nodo("el vehiculo "+ a[pos]+"ingreso"));
		
	}
	synchronized void salir(ListaSimple x, Auto a[],int pos){
		x.insertarCab(new Nodo("el vehiculo "+ a[pos]+"salio"));
	}
}
