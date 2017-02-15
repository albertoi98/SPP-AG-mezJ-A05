/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agómezj.a05;
import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class SPPAGómezJA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int V1;
        double V2;
        String V3;
        
        V1=solicitarEntero("número entero");        
        V2=solicitarDouble ("número decimal");
        V3=solicitarString ("frase");
        
        System.out.println("número entero:" + V1);
        System.out.println("número decimal:" + V2);
        System.out.println("frase:" + V3);
 }
    public static int solicitarEntero(String mensaje){
        Scanner kb = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.println("Introducir " + mensaje);
        try{
        varEntera = kb.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("variable incorrecta " + ex);
            flag=true;
            kb.nextLine();
    } 
  } while (flag); 
    return varEntera;
    }
    
    public static double solicitarDouble (String mensaje){
        Scanner kb = new Scanner (System.in);
        double varDouble = 0;
        boolean flag;
        
        do{
        System.out.println("Introducir " + mensaje);
        try{
        varDouble = kb.nextDouble();
        flag=false;
    }catch (Exception ex){
            System.out.println("variable incorrecta " + ex);
            flag=true;
            kb.nextLine();
    } 
  } while (flag); 
    return varDouble;
    }
    
    public static String solicitarString (String mensaje){
        Scanner kb = new Scanner (System.in);
        String varString = null;
        boolean flag;
        
        do{
        System.out.println("Introducir " + mensaje);
        try{
        varString = kb.nextLine();
        flag=false;
    }catch (Exception ex){
            System.out.println("variable incorrecta" + ex);
            flag=true;
            kb.nextLine();
    } 
        
  } while (flag); 
    return varString;
    }
    
}
