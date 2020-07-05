public class Mago extends Heroe{
    
    
    private int mana;
    
    public Mago(String nombre) {
        super(nombre);
        this.fuerza=1;
        this.vida=100;
        this.defensa=10;
        this.magia=20;
        this.mana=(this.magia*8);      
    }
 
    
    public int bolaDeFuego(){
        if(this.mana>=15){
            this.mana-=15;
            return 4*(this.magia);
        }else{
            return 0;
        }
        
    }
    
    public int LanzaDeHielo(){
        if(this.mana>=5){
            this.mana-=5;
            return 2*(this.magia);
        }else{
            return 0;
        }
        
    }
}
