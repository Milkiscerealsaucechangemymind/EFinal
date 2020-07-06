public class Heroe {
    protected String nombre;
    protected int vidas;
    protected int vida;
    protected int fuerza;
    protected int magia;
    protected int defensa;
    protected int oro;
    protected int asesinatos;
    protected int turno;
    protected Objeto[] inventario;
    protected int numObjetos;

    public Heroe() {
    }

    
    
    public Heroe(String nombre) {
        this.nombre = nombre;
        this.inventario=new Objeto[6];
        this.vidas=3;
    }

    public int getNumObjetos() {
        return numObjetos;
    }

    public void setNumObjetos(int numObjetos) {
        this.numObjetos = numObjetos;
    }
    
    

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAsesinatos() {
        return asesinatos;
    }

    public void setAsesinatos(int asesinatos) {
        this.asesinatos = asesinatos;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }  

    public Objeto[] getInventario() {
        return inventario;
    }

    public void setInventario(Objeto[] inventario) {
        this.inventario = inventario;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    public void agregarObjeto(Objeto o){
        int i=0;
        while(this.inventario[i]!=null){
            i++;
        }
        this.inventario[i]=o;
        if("Magia".equals(o.getInfo())){
                this.magia+=o.getAumento();
            }else if("Fuerza".equals(o.getInfo())){
                this.fuerza+=o.getAumento();
            }
        this.numObjetos++;
    }
    
    public int numObjetos(){
        int i=0;
        while(this.inventario[i]!=null){
            i++;
        }
        return i;
    }
    
}
