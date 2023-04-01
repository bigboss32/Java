
public class Empresa {
String nombreEmpresa;
int nit,numerodevehiculos;
LIsta_doble lista=new LIsta_doble();
public Empresa(String nombreEmpresa, int nit, int numerodevehiculos) {
	this.nombreEmpresa = nombreEmpresa;
	this.nit = nit;
	this.numerodevehiculos = numerodevehiculos;
}
void afiliarvechiculo(Vehiculo a){
	lista.agregarPrincipio(new Nodo(a));
}
void desvincularvehiculo(){
	
}
@Override
public String toString() {
	return "Empresa [nombreEmpresa=" + nombreEmpresa + ", nit=" + nit + ", numerodevehiculos=" + numerodevehiculos
			+ "]";
}


}
