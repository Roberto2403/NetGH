/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays_ej_loteria;

/**
 *
 * @author romanu601
 */
    import java.util.Random;
    import java.util.Scanner;

public class ARRAYS_EJ_LOTERIA {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Random NumRandom = new Random ();
        Scanner sc =  new Scanner (System.in); 
        
        int [ ] seisNum = new int [6];                                      
        
            for (int i = 0; i < seisNum.length; i++) {
                seisNum[ i ] = NumRandom.nextInt(49) +1;                    /** Aqui estamos creado el NUMERO GANADOR */ 
             
        }    
            
            
            
            
            
            
            
            
            
            
                System.out.println("Los 6 numeros ganadores son : ");
                
                    for ( int numero:seisNum) {
                      System.out.println( +numero + " ") ; 

    }
                    
                    
        
        
    }
    
}
