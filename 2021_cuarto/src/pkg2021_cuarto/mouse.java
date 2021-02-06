/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2021_cuarto;

/**
 *
 * @author rober
 */
public class mouse {
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
