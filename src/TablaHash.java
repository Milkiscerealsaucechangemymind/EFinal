
public class TablaHash {
    private Lista[] tabla;
    private int numElementos;
    private int tamaño;
    private double factorCarga;

    public TablaHash() {
        this.tabla=new Lista[1];
        this.tamaño =1;
        
        this.factorCarga=numElementos/tamaño;
    }

    public Lista[] getTabla() {
        return tabla;
    }

    public void setTabla(Lista[] tabla) {
        this.tabla = tabla;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public double getFactorCarga() {
        return factorCarga;
    }

    public void setFactorCarga(double factorCarga) {
        this.factorCarga = factorCarga;
    }
    
    
    
    public void updateFC(){
        this.factorCarga=this.numElementos/this.tamaño;
    }
    
    public void rehash(){
        if(this.factorCarga>0.9){
            Lista[] temp=new Lista[this.tamaño*2];
            this.tamaño=this.tamaño*2;
            int a=0,b=0,p=0,hash=0;
            Nodo n=new Nodo();
            p=10000019;
            a=5215000;
            b=432588;
            for(int i=0;i<this.tabla.length;i++){
                for(int j=0;j<this.tabla[i].getSize();j++){
                    n=this.tabla[i].getCabeza();
                    this.tabla[i].popFront();
                    //Insertar en nuevo arreglo hash
                    hash=((a*n.getDato().getVida()+b)%p)%tamaño;
                    if(temp[hash]==null){
                        Lista mm=new Lista();
                        temp[hash]=mm;
                    }
                    temp[hash].pushFront(n.getDato());
                }
            }
           this.tabla=temp; 
        }
    }
    
   
    
    public int  hashCode(String nombre){
       int g=31;
       int hash=0;
       for(int i=0;i<nombre.length();i++){
           hash=g*hash+nombre.charAt(i);
       }
       hash=((hash*10+20)%31)%this.tamaño;
       return Math.abs(hash);
    }
    
    
    
    public void insert(Enemigo e){
        int hash=0;
        hash=this.hashCode(e.getNombre());
        if(this.tabla[hash]==null){
            Lista l=new Lista();
            this.tabla[hash]=l;
        }
        this.tabla[hash].pushFront(e);
        numElementos++;
        this.updateFC();
        this.rehash();
    }
    
    public void delete(Enemigo e){
        int hash=0;
        hash=this.hashCode(e.getNombre());
        this.tabla[hash].eraseKey(this.tabla[hash].getEnemigoXNombre(e.getNombre()));
        numElementos--;
        this.updateFC();
    }
    
    public Enemigo find(String nombre){
        int hash=0;
        hash=this.hashCode(nombre);
        return this.tabla[hash].getEnemigoXNombre(nombre);
    }
    
    
    
    
    
    
}
