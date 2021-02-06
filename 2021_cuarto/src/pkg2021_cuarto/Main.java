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
       
        
        
        
        
        x[0]=new mouse();
        x[0].setColor("Negro");
        x[0].setpeso(12);
        x[0].setNombre("Mouse");
        x[0].setEntrada(true);
        
        System.out.println("Color: "+x[0].getColor());
        System.out.println("Peso: "+x[0].getpeso());
        System.out.println("Nombre: "+x[0].getNombre());
        System.out.println("Entrada: "+x[0].Delmer_Entrada());
        
        x[1]=new mouse();
        x[1].setColor("Azul");
        x[1].setpeso(16);
        x[1].setNombre("Mouse");
        x[1].setEntrada(true);
        
        
       System.out.println("Color: "+x[1].getColor());
       System.out.println("Peso: "+x[1].getpeso());
       System.out.println("Nombre: "+x[1].getNombre());
       System.out.println("Entrada: "+x[1].Delmer_Entrada());
    }
    
}
