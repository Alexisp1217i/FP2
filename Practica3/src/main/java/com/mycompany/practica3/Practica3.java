/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class Practica3 {

    public static void main(String[] args) {
        Scanner scani = new Scanner(System.in);
     String A;
        System.out.println("Introduce el caracter");
            A = scani.nextLine();
         
        
        for(int i=0;i<=A.length() -1;i++){
             System.out.println(A.charAt(i));           
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
