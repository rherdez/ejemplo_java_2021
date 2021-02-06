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
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mouse []x=new mouse[2];
        periferico p=new periferico();
        p.setEntrada(true);
        p.setNombre("mouse");
        
        System.out.println("Entrada: "+p.Delmer_Entrada());
        System.out.println("Nombre: "+p.getNombre());
        
        
        
        
        x[0]=new mouse();
        x[0].setColor("Negro");
        x[0].setpeso(12);
        
        System.out.println("Color: "+x[0].getColor());
        System.out.println("Peso: "+x[0].getpeso());
        
        x[1]=new mouse();
        x[1].setColor("Azul");
        x[1].setpeso(16);
        
       System.out.println("Color: "+x[1].getColor());
        System.out.println("Peso: "+x[1].getpeso());
    }
    
}
