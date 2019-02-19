/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Consola;
import model.Tabla;

/**
 * @version 1.0
 * @author Kevin Garcia
 * @since 26/08/18 Esta clase muestra el menu de una tabla de Amortizacion
 * @copyrigth
 *
 */
public class MenuInteres {

    public static void main(String[] args) {
        int opcion;
        double Capital_Inicial;
        double Tasa_Interes = 0;
        int Numero_De_Periodos;
        double[][] tabla = null;
        do {

            System.out.println("***************************************");
            System.out.println("* 1.    Generar Tabla De Amortizacion");
            System.out.println("* 2.    Mostrar Tabla De Amortizacion");
            System.out.println("* 3.    Mostrar los intereses causados al enésimo periodo");
            System.out.println("* 4.    Mostrar el valor total pagado del crédito.");
            System.out.println("* 5.    Mostrar la variación porcentual del Interés");
            System.out.println("* 6.    Mostrar la variación porcentual de la Cuota");
            System.out.println("* 0.    Salir");
            System.out.println("***************************************");
            opcion = Consola.getInt("");
            switch (opcion) {
                case 1:
                    Capital_Inicial = Consola.getDouble("Digite El Capital Inicial");
                    Tasa_Interes = Consola.getDouble("Digite La Tasa De Interes");
                    Numero_De_Periodos = Consola.getInt("Digite El Numero De Periodos");
                    System.out.println("Generando Tabla...");
                    System.out.println("Tabla Generada Con Exito!!");
                    tabla = Tabla.generarTablaAmortizacion(Capital_Inicial, Tasa_Interes, Numero_De_Periodos);
                    break;
                case 2:
                    Tabla.mostrarTablaAmortizacion(tabla);
                    break;
                case 3:
                    System.out.println(Tabla.mostrarInteresAlEnesimo(Tasa_Interes, tabla));
                    break;
                case 4:
                    System.out.println(Tabla.valorTotalPagadoDelCredito(tabla));
                    break;
                case 5:
                    System.out.println(Tabla.mostrarVariacionPorcentualDeInteres(tabla));
                    break;
                case 6:
                    System.out.println(Tabla.mostrarVariacionPorcentualDeCuota(tabla));
                    break;
                case 0:
                    System.out.println("Gracias Por Usar Nuestro Programa");
                    break;
                default:
                    System.out.println("Usted marco una opcion incorrecta");
                    break;

            }
        } while (opcion != 0);
    }
}
