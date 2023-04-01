
public class Principal {

	public static void main(String[] args) {
		ListaCircular x = new ListaCircular();
		x.insertarinicio(1000);
		x.insertarinicio(100);
		x.insertarinicio(50);
		x.insertarinicio(700);
		x.insertarinicio(40);
		x.insertarinicio(900);
		x.insertarinicio(60);
		x.imprimir();
		ListaDoble k= new ListaDoble();
		Clientes n[]=new Clientes[10];
		for (int i = 0; i < n.length; i++) {
			n[i]=new Clientes(i, i, ""+i,""+ i);
		}
		Clientes z[]=new Clientes[5];
		for (int i = 0; i < 5; i++) {
			int alatorio=(int)(Math.random() *n.length ) ;
			z[i]=n[alatorio];
		}
	 
		for (int i = 0; i < z.length; i++) {
			int ala=(int)(Math.random() *20+1 ) ;
			int t=x.girar(ala).getDato();
			if (t==1000) {
				System.out.println("ganador final"+z[i]);
			}else{
				k.InsertarInicio(""+t +" "+z[i]);
			}
			
			
		}
			}

}
