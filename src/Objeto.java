public class Objeto {
    private String nombre;
    private int aumento;
    private String info;
    private int costo;

    public Objeto(String nombre, int aumento, String info, int costo) {
        this.nombre = nombre;
        this.aumento = aumento;
        this.info = info;
        this.costo = costo;
    }

    

    public Objeto() {
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getAumento() {
        return aumento;
    }

    public void setAumento(int aumento) {
        this.aumento = aumento;
    }
    
    
    
    
}
