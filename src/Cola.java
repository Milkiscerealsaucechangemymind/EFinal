public class Cola {
    private NodoCola cabeza;
    private NodoCola cola;
    private int tamaño;

    public Cola() {
    }

    public NodoCola getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCola cabeza) {
        this.cabeza = cabeza;
    }

    public NodoCola getCola() {
        return cola;
    }

    public void setCola(NodoCola cola) {
        this.cola = cola;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    //Métodos
    public void enqueue(String dato){
            NodoCola nodo=new NodoCola(dato);
            nodo.setNext(null);
            if(this.cola==null){
                this.setCabeza(nodo);
                this.setCola(nodo);
            }else{
                this.cola.setNext(nodo);
                this.setCola(nodo);
            }
            this.tamaño++;
    }
        
        public String dequeue(){
            
            String f=cabeza.getDato();
            cabeza=cabeza.getNext();
            tamaño--;
            if(tamaño==0){
                this.cabeza=this.cola=null;
            }
            return f;
        }
        
        public String peek(){
            return this.cabeza.getDato();
        }
            
       
}
