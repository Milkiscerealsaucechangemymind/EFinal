
public class Tienda {
    private Objeto[] objetos;

    public Tienda() {
        this.objetos=new Objeto[6];
    }

    public Objeto[] getObjetos() {
        return objetos;
    }

    public void setObjetos(Objeto[] objetos) {
        this.objetos = objetos;
    }
    
    

    public void addObjeto(String nombre,int aumento,String info,int costo){
        Objeto n=new Objeto(nombre,aumento,info,costo);
        int i=0;
        while(this.objetos[i]!=null){
            i++;
        }
        this.objetos[i]=n;
    }
    
}
