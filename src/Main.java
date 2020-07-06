
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) throws FileNotFoundException,IOException,InputMismatchException {
        //Persistencia
        
        
       Juego juego=new Juego(0);
        
        
        //Rellenar tabla hash con datos de archivo de texto
        try{       
            File file1 = new File("Docs\\heroes.txt");
            File file2 = new File("Docs\\enemigos.txt");
             Scanner ss=new Scanner(file1);
            if(ss.hasNext()){
                    
                    //Heroes y nivel
                    int x=0,aumento=0,costo=0,vida=0,oro=0,asesinatos=0,numObjetos=0,turno=0;
                    String clase="",name="",nombreObjeto="",info="";
                    // Número de héroes
                    x=ss.nextInt();
                    ss.nextLine();
                    juego.resizeHeroes(x);
                    Heroe hh=new Heroe();
                    for(int j=0;j<x;j++){
     
                        //Agrego héroes a juego
                       name=ss.nextLine();
                        
                       //ss.nextLine();
                       clase=ss.nextLine();
                       //ss.nextLine();

                       if("Guerrero".equals(clase)){
                            Guerrero h=new Guerrero(name);
                            
                            hh=h;
                        }else if("Mago".equals(clase)){
                            Mago h=new Mago(name);   
                            
                            hh=h;
                        }else if("Sacerdote".equals(clase)){
                            Sacerdote h=new Sacerdote(name);
                            
                            hh=h;
                        } 
                        
                       //Vida
                       vida=ss.nextInt();
                       hh.setVida(vida);
                       //Oro
                       oro=ss.nextInt();
                       hh.setOro(oro);
                       //Asesinatos
                       asesinatos=ss.nextInt();
                       hh.setAsesinatos(asesinatos);
                       //Turno
                       turno=ss.nextInt();
                       hh.setTurno(turno);
                       //Objetos
                       numObjetos=ss.nextInt();
                       ss.nextLine();
                       //Agrego objetos y aumento atributos héroe
                       for(int k=0;k<numObjetos;k++){
                           nombreObjeto=ss.nextLine();
                           aumento=ss.nextInt();
                           ss.nextLine();
                           info=ss.nextLine();
                           costo=ss.nextInt();
                           Objeto o=new Objeto(nombreObjeto,aumento,info,costo);
                           hh.agregarObjeto(o);        
                       }
                        
                       juego.addHeroe(hh);
                    }
                    //Cambiar nivel del juego
                    x=ss.nextInt();
                    juego.setNivel(x);
                    //juego.ordenar();
                    ss.close();
                    
            }else{
                juego.resizeHeroes(3);
                
            }
            
            
            //////////////////////////////////Pruebas/////////////////////////////////////////////////
            //juego.agregarHeroe("Mago", "Megumin");
            //juego.agregarHeroe("Guerrero", "Varyan");
            //juego.agregarHeroe("Sacerdote", "Uribe");
            //juego.ordenarHeroesxTurno();
            //System.out.println(juego.buscarHeroexNombre("Megumin").getNombre());
            //System.out.println(juego.nombresH());
            System.out.println(juego.nombresH());
            juego.getHeroes()[0].setAsesinatos(1);
            
            ////////////////////////////////////////////////////////////////////////////////////////////
            
                
                
                
                
                
                
                //Guardar héroes en archivo de texto
                
                    PrintStream flujoSalida1=new PrintStream(file1);
                    if(juego.getHeroes().length>0){
                        flujoSalida1.println(juego.getHeroes().length);
                        for(int i=0;i<juego.getHeroes().length;i++){
                            flujoSalida1.println(juego.getHeroes()[i].getNombre());

                            if(juego.getHeroes()[i] instanceof Guerrero){
                                flujoSalida1.println("Guerrero");
                            }else if(juego.getHeroes()[i] instanceof Mago){
                                flujoSalida1.println("Mago");
                            }else if(juego.getHeroes()[i] instanceof Sacerdote){
                                flujoSalida1.println("Sacerdote");
                            }
                            flujoSalida1.println(juego.getHeroes()[i].getVida());
                            flujoSalida1.println(juego.getHeroes()[i].getOro());
                            flujoSalida1.println(juego.getHeroes()[i].getAsesinatos());
                            flujoSalida1.println(juego.getHeroes()[i].getTurno());
                            flujoSalida1.println(juego.getHeroes()[i].getNumObjetos());
                            
                            for(int j=0;j<juego.getHeroes()[i].getNumObjetos();j++){
                                if(juego.getHeroes()[i].getInventario()[j]!=null){
                                    flujoSalida1.println(juego.getHeroes()[i].getInventario()[j].getNombre());
                                    flujoSalida1.println(juego.getHeroes()[i].getInventario()[j].getAumento());
                                    flujoSalida1.println(juego.getHeroes()[i].getInventario()[j].getInfo());
                                    flujoSalida1.println(juego.getHeroes()[i].getInventario()[j].getCosto());
                                }
                            }

                        }
                        flujoSalida1.println(juego.getNivel());
                        flujoSalida1.flush();
                        flujoSalida1.close();
                    }else{
                        flujoSalida1.print("");
                    }
          
            }catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }    
    }
}
