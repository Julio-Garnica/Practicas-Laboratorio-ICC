public class ListaLigada {
    private Nodo cabeza;

    public ListaLigada() {
        this.cabeza = null; 
    }

    public void insertarFinal (int elemento){
        Nodo nuevoNodo = new Nodo(elemento);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual=cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente=nuevoNodo;
        }
    }

    public void eliminar (int elemento){
        if (cabeza==null) {
            return;
        } 

        if (cabeza.elemento==elemento) {
            cabeza=cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.elemento != elemento) {
            actual = actual.siguiente;
        }
        actual.siguiente = actual.siguiente.siguiente;
    }

    public String toString() {
        if (cabeza==null) {
            return "La lista esta vacia";
        }

        String cadena = "";
        Nodo actual = cabeza;
        while (actual != null) {
            cadena += String.valueOf(actual.elemento) + " -> ";
            actual = actual.siguiente;
        }
        cadena += "null";
        return cadena;
    }

    private class Nodo {
        private int elemento;
        private Nodo siguiente;

        public Nodo(int elemento){
            this.elemento=elemento;
            this.siguiente=null;
        }
    }
}
