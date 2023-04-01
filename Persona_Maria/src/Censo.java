
public class Censo {
	int tmano;
	int cantm=0,cantf=0;
	String b;
	public Censo(int tmano) {
		this.tmano = tmano;
	}

	private Persona registra(Persona n){
		return n;
	}
	Persona registrac(int edad,int cc,String nombre,boolean sexo){
		Persona a=new Persona(cc,edad,nombre,sexo);
		return registra(a);
	}
	String concatenar(Persona n){
		String a="";
		a=" "+n;
		return a;
	}
	String consulta(Persona a){
		
		
		if (a.isGenero()) {
			cantm++;
			return b="hombre "+cantm;	
		}
		cantf ++;
		return b="mujer "+cantf;
	}
}
