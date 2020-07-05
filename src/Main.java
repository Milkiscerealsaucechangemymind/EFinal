
public class Main {
    public static void main(String[] args) {
       Juego juego=new Juego(1);
       juego.agregarHeroe("Mago", "Megumin");
       juego.agregarEnemigo("Pedro", 1000, 10, 10);
       juego.ordenarHeroesxTurno();
       System.out.println(juego.getEnemigos().find("Pedro").getVida());
       juego.atacar("Pedro", "Bola de fuego");
       System.out.println(juego.getEnemigos().find("Pedro").getVida());
        
    }
}
