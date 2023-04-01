 

public class ListaDoble {

    private Nodod inicio;
    private Nodod ultimo;
    private int tamano;

    public ListaDoble() {
        tamano = 0;
        inicio = null;
        ultimo = null;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void InsertarInicio(String dato) {
        if (vacia()) {
            inicio = ultimo = new Nodod(dato, null, null);
        } else {
            inicio = new Nodod(dato, inicio, null);
            inicio.getSig().setAnt(inicio);
        }
        tamano++;
    }

    public void InsertarUltimo(String dato) {
        if (vacia()) {
            inicio = ultimo = new Nodod(dato, null, null);
        } else {
            ultimo = new Nodod(dato, null, ultimo);
            ultimo.getAnt().setSig(ultimo);
        }
        tamano++;
    }

//    public void InsertarEnMedio(int x, int y) {
//        if (!vacia()) {
//            Nodod aux = inicio;
//            while (aux != null) {
//                if (aux.getDato() == x) {
//                    if (aux == ultimo) {
//                        InsertarUltimo(y);
//                    } else {
//                        Nodod nuevo = new Nodod(y, aux.getSig(), aux);
//                        aux.setSig(nuevo);
//                        nuevo.getSig().setAnt(nuevo);
//                        aux = nuevo;
//                        tamano++;
//                    }
//                }
//                aux = aux.getSig();
//            }
//        }
//    }

    public void EliminarInicio() {
        if (inicio == ultimo) {
            inicio = ultimo = null;
        } else {
            inicio = inicio.getSig();
            inicio.setAnt(null);
        }
        tamano--;
    }

    public void EliminarUltimo() {
        if (inicio == ultimo) {
            inicio = ultimo = null;
        } else {
            ultimo = ultimo.getAnt();
            ultimo.setSig(null);
        }
        tamano--;
    }

//    public void EliminarEnMedio(int x) {
//        if (!vacia()) {
//            Nodod aux = inicio;
//            while (aux != null) {
//                if (aux == inicio && aux.getDato() == x) {
//                    EliminarInicio();
//                    aux = inicio;
//                }
//                if (aux.getDato() == x && inicio != aux && aux != ultimo) {
//                    aux.getAnt().setSig(aux.getSig());
//                    aux.getSig().setAnt(aux.getAnt());
//                    tamano--;
//                }
//
//                if (aux == ultimo && aux.getDato() == x) {
//                    EliminarUltimo();
//
//                }
//                aux = aux.getSig();
//            }
//        }
//    }

    public String MostrarInicioUltimo() {
        String lista = "";
        Nodod aux = inicio;
        while (aux != null) {
            lista += " " + aux.getDato() + " ";
            aux = aux.getSig();
        }
        return lista;
    }

    public String MostrarUltimoInicio() {
        String lista = "";
        Nodod aux = ultimo;
        while (aux != null) {
            lista += " " + aux.getDato() + " ";
            aux = aux.getAnt();
        }
        return lista;
    }
    public void comprobar ()
    {
        Nodod reco = inicio;
        while (reco != null) {
            System.out.print (reco.getDato() + "-");
            reco = reco.getSig();
        }
        System.out.println();
    }

    public Nodod getInicio() {
        return inicio;
    }

    public void setInicio(Nodod inicio) {
        this.inicio = inicio;
    }

    public Nodod getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodod ultimo) {
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
        return "ListaDoble{" + "inicio=" + inicio + ", ultimo=" + ultimo + ", tamano=" + tamano + '}';
    }

}
