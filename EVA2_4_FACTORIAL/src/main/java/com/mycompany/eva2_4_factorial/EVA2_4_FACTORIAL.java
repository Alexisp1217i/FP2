/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class EVA2_4_FACTORIAL {

    public static void main(String[] args) {
           int numero = 5; 
        int resultado = 1; 

        for (int i = 1; i <= numero; i++) {
            resultado *= i; 
        }

        System.out.println("El factorial de " + numero + " es " + resultado); // Imprimimos el resultado
              
    }
}
