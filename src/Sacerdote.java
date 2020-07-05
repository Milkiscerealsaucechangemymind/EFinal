public class Sacerdote extends Heroe{
    
    private int fe;
    
    public Sacerdote(String nombre) {
        super(nombre);
        this.fuerza=1;
        this.vida=150;
        this.defensa=10;
        this.magia=15;
    }
    
    public void rezar(){
        this.fe+=20;
    }
    
    public int curar(){
        if(this.fe>=5){
            this.fe-=5;
            return 5*(this.magia);
        }else{
            return 0;
        }  
    }
    
}
