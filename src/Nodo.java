public class Nodo {
    private Enemigo dato;
    private Nodo next;

    public Nodo() {
    }

    public Nodo(Enemigo dato) {
        this.dato = dato;
    }

    public Enemigo getDato() {
        return dato;
    }

    public void setDato(Enemigo dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
}
