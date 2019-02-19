/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Coordinador
 */
public class Consola {

    /**
     * Leer los datos de tipo float digitado por el usuario
     *
     * @param mensaje El mensaje a mostrar cuando lso datos son solicitados
     * @return Un numero float digitado pro el usuario
     */
    public static int getInt(String mensaje) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print(mensaje + ">");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.err.println("El dato ingresado no es número");
            System.out.print(mensaje + ">");
        }
        return scanner.nextInt();
    }
    public static double getDouble(String mensaje) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print(mensaje + ">");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.err.println("El dato ingresado no es número");
            System.out.print(mensaje + ">");
        }
        return scanner.nextDouble();
    }

} // Fin deConsola
