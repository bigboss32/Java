
public class Cola_doble {
	Nodo cab, cola;

	Cola_doble() {
		cab = null;
	}

	public boolean isVacia() {
		return cab == null;
	}

	public void limpiar() {
		cab = cola = null;
	}

	public Vehiculo atender() {
		Vehiculo info;
		if (!isVacia()) {
			info = cola.info;
			if (cab == cola) {                
				limpiar();                
			} else {
				cola = cola.ant;
				cola.sig = null;
			}
			return info;
		}
		return null;
	}

	public void insertar(Nodo nuevo) {
		if (isVacia()) {
			cola = nuevo;
		} else {
			nuevo.sig = cab;
			cab.ant = nuevo;
		}
		cab = nuevo;
	}
	Cola_doble unficar(Cola_doble a,Cola_doble b) {
		Cola_doble n = new Cola_doble();
		while (a.isVacia()!=true){
			n.insertar(new Nodo(a.atender()));
			n.insertar(new Nodo(b.atender()));
		}
		return n;
	}
	Cola_doble subCola(int atributo,String valor){
		Cola_doble a =new Cola_doble();
		Vehiculo b;
		
		if (atributo==1 && valor.equals("oriente")) {
			while (!isVacia()){
				b=atender();
				if (b.getDestino().equals("oriente")) {
					a.insertar(new Nodo(b));
				}}
			if (atributo==1 && valor.equals("sur")) {
				while (!isVacia()){
					b=atender();
					if (b.getDestino().equals("sur")) {
						a.insertar(new Nodo(b));
					}
				}
				if (atributo==2) {
					while (!isVacia()){
						b=atender();
						if (b.getVehiculo().equals(valor)) {
							a.insertar(new Nodo(atender()));
						}
					}
				}
			}
		}
		return a;
		
	}

	@Override
	public String toString() {
		String mostrar = "";
		Nodo tmp = cab;
		while (tmp != null) {
			mostrar += tmp.info;
			tmp = tmp.sig;
		}
		return mostrar;
	}
}
