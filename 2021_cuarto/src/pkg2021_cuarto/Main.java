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
import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    static ArrayList<mouse> grupo=new ArrayList<mouse>();
    static Scanner sc=new Scanner(System.in);
    static void agregar(){
        mouse m=new mouse();
        String x;
            System.out.println("Ingrese Nombre: ");
            m.setNombre(sc.next());
            x=sc.next();
            System.out.println("Ingrese Color: ");
            m.setColor(sc.next());
            System.out.println("Ingrese Peso: ");
            m.setpeso(sc.nextInt());

        grupo.add(m);
        
    }
    
    static void presentar(){
        
        for(int i=0;i<grupo.size();i++){
            System.out.println("");
            System.out.println((i+1)+"==============================================");
            System.out.println("Nombre: "+grupo.get(i).getNombre());
            System.out.println("Color: "+grupo.get(i).getColor());
            System.out.println("Peso: "+grupo.get(i).getpeso());
            System.out.println("Entrada"+grupo.get(i).Delmer_Entrada());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        
        do{
            System.out.println("Menu");
            System.out.println("1) Agregar");
            System.out.println("2) Presentar");
            System.out.println("0) Salir");
            op=sc.nextInt();
            
            switch(op){
                case 1:
                       agregar();
                       break;
                case 2:
                        presentar();
                        break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(op!=0);
    
    }
    
}
