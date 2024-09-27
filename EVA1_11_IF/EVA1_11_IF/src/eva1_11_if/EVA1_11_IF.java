/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA1_11_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //condinacion
        //SOLICITAD LA EDAD
        int edad;
        Scanner captu = new Scanner(System.in); 
       
        System.out.println("EDAD");  
        edad = captu.nextInt();
        if(edad >= 18){
        //determinado si es un adulto si o no
        //resultado un verdadero o falzo 
        System.out.println("ES UN ADULTO");
        }else{
        System.out.println("menor de edad");
        
        }
    }
    
}
