/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class EVA2_11_NUMERO_MAYOR {

    public static void main(String[] args) {
 int num1,num2 = 0;
            Scanner captu = new Scanner(System.in);
     do{
        System.out.println("Numero:");
         num1 = captu.nextInt();
         if(num1 >= num2){
             num2 = num1;
         }
      }while(num1 >= 0);    
        System.out.println("el numero mas grande es :"+ num2);
    }
    
}
