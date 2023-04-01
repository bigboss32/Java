
public class Metodos {

	String buscarvehiculo(int nit,int interno,Empresa a[]){
		String e = null;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==null) {

			}else{
				if (a[i].nit==nit) {


					e=""+a[i].lista.BuscarElementoEsp(interno);
				}
			}
		}
		return e;
	}
	String actualizarvehiculo(int nit,int interno,String placa,String tipo,Empresa  a[]){
		String e = null;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==null) {

			}else{
				if (a[i].nit==nit) {

					return e=""+a[i].lista.actualizar(interno, placa, tipo, interno);
				}
			}
		}
		return e;
	}

	String entradaysalida(int nitempresa, int nitinterno,boolean n,Empresa a[]){
		String y="";
		for (int i = 0; i < a.length; i++) {
			if (a[i]==null) {

			}else{
				if (a[i].nit==nitempresa) {

					y= a[i].lista.registro(nitinterno, n);
				}
			}
		}
		
		return y;

	}
}
