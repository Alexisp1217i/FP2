/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_validar;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class Eva2_8_VALIDAR {

    public static void main(String[] args) {
       int dia;
            Scanner captu = new Scanner(System.in);
     do{
        System.out.println("Numero Correspondiente al dia (1-7):");
         dia = captu.nextInt();
      }while(dia < 1 || dia > 7 );
         switch(dia){
          case 1:
          System.out.println("Lunes");
          break;
          case 2:
          System.out.println("Martes");
          break;
          case 3:
          System.out.println("Miercoles");
          break;
          case 4:
          System.out.println("Jueves");
          break;
          case 5:
          System.out.println("Viernes");
          break;
          case 6:
          System.out.println("Sabado");
          break;
          case 7:
          System.out.println("Domingo");
          break;
          default:
          System.out.println("Numero invalido solo del (1-7)");
      }
           }
}