/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_usuario_psw;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class EVA2_9_USUARIO_PSW {

    public static void main(String[] args) {
     String usuario, password;
        Scanner scani = new Scanner(System.in);
        do{
        System.out.println("usuario:");
        usuario = scani.nextLine();
        System.out.println("Password:");
        password = scani.nextLine();
        }while(!((usuario.equals("admin")) && password.equals("admin")));
        System.out.println("Binevenido!!!");
    }
}
