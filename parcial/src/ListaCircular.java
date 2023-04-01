
public class ListaCircular {

	private Nodo inicio;
	private Nodo ultimo;
	private int tamano;

	public ListaCircular() {
		this.inicio = null;
		this.ultimo = null;
		this.tamano = 0;
	}

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public Nodo getUltimo() {
		return ultimo;
	}

	public void setUltimo(Nodo ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "ListaCircular [inicio=" + inicio + ", ultimo=" + ultimo + ", tamano=" + tamano + "]";
	}

	public boolean vacia() {
		return inicio == null;
	}

	private void insertar(int d) {
		if (vacia()) {
			inicio = ultimo = new Nodo(d, inicio, inicio);
			inicio.setAnterior(inicio);
			inicio.setSiguiente(inicio);
			ultimo.setAnterior(ultimo);
			ultimo.setSiguiente(ultimo);
		} else {
			Nodo nuevo = new Nodo(d, inicio, ultimo);
			inicio.setAnterior(nuevo);
			ultimo.setSiguiente(nuevo);
		}
		tamano++;
	}

	public void insertarinicio(int d) {
		insertar(d);
		inicio = inicio.getAnterior();
	}

	public void insertUltimo(int d) {
		insertar(d);
		ultimo = ultimo.getSiguiente();
	}

	public void InsertarMedio(int x, int d) {
		if (!vacia()) {
			Nodo aux = inicio;
			while (aux != ultimo) {
				if (aux.getDato() == x) {
					Nodo nuevo = new Nodo(d, aux.getSiguiente(), aux);
					aux.getSiguiente().setAnterior(nuevo);
					aux.setSiguiente(nuevo);
					aux = nuevo;
					tamano++;
				}
				aux = aux.getSiguiente();
			}
			if (aux.getDato() == x) {
				insertUltimo(d);
			}
		}
	}

	public void eliminarinicio() {
		if (!vacia()) {
			if (inicio == ultimo) {
				inicio = ultimo = null;
			} else {
				ultimo.setSiguiente(inicio.getSiguiente());
				inicio.getSiguiente().setAnterior(ultimo);
				inicio = inicio.getSiguiente();
			}
			tamano--;
		}
	}

	public void eliminarultimo() {
		if (!vacia()) {
			if (inicio == ultimo) {
				inicio = ultimo = null;
			} else {
				inicio.setAnterior(ultimo.getAnterior());
				ultimo.getAnterior().setSiguiente(inicio);
				ultimo = ultimo.getAnterior();
			}
			tamano--;
		}
	}

	public void EliminarEnMedio(int x) {
		if (!vacia()) {
			if (inicio.getSiguiente() == inicio && inicio.getDato() == x) {
				inicio = ultimo = null;
			} else {
				Nodo aux = inicio;
				while (aux != ultimo) {
					if (inicio.getDato() == x) {
						eliminarinicio();
						aux = inicio;
					}
					if (aux.getDato() == x && aux != inicio) {
						aux.getAnterior().setSiguiente(aux.getSiguiente());
						aux.getSiguiente().setAnterior(aux.getAnterior());
						aux = aux.getSiguiente();
						tamano--;
					}
					if (aux.getDato() != x) {
						aux = aux.getSiguiente();
					}
				}
				if (aux.getDato() == x) {
					eliminarultimo();
				}
			}
		}
	}

	public String mostrarInicioUltimo() {
		String lista = " ";
		if (!vacia()) {
			lista += "{" + inicio.getDato() + "}";
			Nodo aux = inicio.getSiguiente();
			while (aux != inicio) {
				lista += "{" + aux.getDato() + "}";
				aux = aux.getSiguiente();
			}
		}
		return lista;
	}

	public String mostrarUltimoInicio() {
		String lista = " ";
		if (!vacia()) {
			lista += "{" + ultimo.getDato() + "}";
			Nodo aux = ultimo.getAnterior();
			while (aux != ultimo) {
				lista += "{" + aux.getDato() + "}";
				aux = aux.getAnterior();
			}
		}
		return lista;
	}
	public void imprimir(){
		if(inicio==null)
			System.out.println("<-->NULL<-->");
		else{
			Nodo aux=inicio;
			System.out.print("<--> Inicio");
			do{
				System.out.print(" <--> "+aux.getDato());
				aux=aux.getSiguiente();
			}while(aux!=inicio);
			System.out.println(" <-->NULL<-->");
		}
	}
	Nodo girar(int a){
		if(inicio==null)
			return null;
		else{
			Nodo aux=inicio;
			for (int i = 0; i < a; i++) {
				aux.getDato();
				aux=aux.getSiguiente();
			}
			return aux;  
		}
	}
}
