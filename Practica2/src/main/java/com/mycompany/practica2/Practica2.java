/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica2;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class Practica2 {

    public static void main(String[] args) {
        Scanner scani = new Scanner(System.in);
        int C, A;
        System.out.println("Inserta el primer numero ");
        A = scani.nextInt();
        System.out.println("Iserta el segundo numero");
        C = scani.nextInt();
        for(int i = C ; i <= A; i++){
            System.out.println(i);
        }for(int i = A; i >= C; i--){
            System.out.println(i);
            
       }
    }
}
