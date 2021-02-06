package pkg2021_cuarto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author rober
 */
public class mouse extends periferico{
     
   public mouse(){
       super("n");
   }
    
    public mouse(String c, String nom){
        super(nom);
        color=c;
        peso=0;
        
    }
    private String color;
    private int peso;
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setpeso(int p){
        peso=p;
    }
    
    public String getpeso(){
        return peso+ " Onz.";
    }
    
}
