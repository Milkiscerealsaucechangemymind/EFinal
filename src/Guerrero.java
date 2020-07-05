public class Guerrero extends Heroe{
    
    private int furia;
    
    public Guerrero(String nombre) {
        super(nombre);
        this.fuerza=20;
        this.vida=400;
        this.defensa=20;
    }

    public int getFuria() {
        return furia;
    }

    public void setFuria(int furia) {
        this.furia = furia;
    }
    
    public int golpeMortal(){
        this.furia+=3;
        return 3*(this.fuerza);
    }
    
    public int golpeHeroico(){
        if(this.furia>=20){
            this.furia-=20;
            return 2*(this.fuerza)*(20/5);
        }else{
            return 0;
        }
    }
    
}
