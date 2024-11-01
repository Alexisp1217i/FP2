/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potoncia;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class EVA2_3_POTONCIA {

    public static void main(String[] args) {
      int base, exponente;
              Scanner captu = new Scanner(System.in);
              System.out.println("Introducce la base:");
              base = captu.nextInt();
              captu.nextLine();
              
              System.out.println("Introducce el exponente:");
              exponente = captu.nextInt();
              captu.nextLine();
              
             int resultado =1;
                     for(int i = 1; i <= 3; i++){
                         resultado = resultado * base;
                     }
                     System.out.println("El resultado es =" + resultado);
    }
}
