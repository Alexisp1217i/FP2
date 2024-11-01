/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class Practica1 {

    public static void main(String[] args) {
Scanner scani = new Scanner(System.in);
        String A;
        int B;
        System.out.println("Inserta el texto:");
        A=scani.next();
        System.out.println("Veces que se va a repetir el texto");
        B=scani.nextInt();
        for(int i=1;i<=B ;i++){
             System.out.println(A);           
        }       
             
    }
}
