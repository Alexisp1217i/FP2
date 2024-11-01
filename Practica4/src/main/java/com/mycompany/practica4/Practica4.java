/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica4;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class Practica4 {

    public static void main(String[] args) {
        Scanner scani = new Scanner(System.in);
        String F = "";
        int A;
        System.out.println("Introduce el caracter");
            A = scani.nextInt();
            scani.nextLine();
       
      for(int i = 1 ; i <= A; i++){
          F=F+"*";
            System.out.println(F);
       }
        
        
        
        
        
        
        
        
        
        
        
        /*String cade = "hola mundo!!";
        System.out.println("Long = " + cade.length());
        System.out.println(cade.charAt(5));
        //------------
        String acum = "";
        acum = acum + "-x";
        System.out.println(acum);
        acum = acum + "-x";
       System.out.println(acum);
     */
    }
}
