/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_arreglos_califas;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class EVA2_17_ARREGLOS_CALIFAS {

    public static void main(String[] args) {
     int cantidad;
     int califas[];
     String nombre[];
        Scanner scani = new Scanner(System.in);
            System.out.println("Cntidad de calificaciones a capturar:");
            cantidad = scani.nextInt();
            scani.nextLine();
            califas = new int[cantidad];
            
            for (int i = 0; i < califas.length; i++) {
                System.out.println("Calificacion de estudiante #"+ i);
                nombre[i] = scani.nextLine();
                
                
                System.out.println("Calificacion de estudiante #"+ i);
                califas[i] = scani.nextInt();
                scani.nextLine();
                
        }for (int i = 0; i < califas.length; i++) {
            System.out.print(nombre+ [1]);
        }
            
    }
}
