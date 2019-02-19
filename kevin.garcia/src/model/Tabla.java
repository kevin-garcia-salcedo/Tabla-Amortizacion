/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * @version 1.0
 * @author Kevin Garcia
 * @since 26/08/18 Esta clase contiene diversos metodos de una tabla de amortizacion
 * @copyrigth
 *
 */
public class Tabla {

    public static double[][] generarTablaAmortizacion(double Capital_Inicial, double Tasa_Interes, int Numero_De_Periodos) {
        double[][] tabla;
        tabla = new double[Numero_De_Periodos][6];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i][0] = i + 1;
            tabla[i][1] = (i == 0) ? Capital_Inicial : tabla[i - 1][5];
            tabla[i][3] = tabla[i][1] * Tasa_Interes / 100;
            tabla[i][4] = Capital_Inicial / Numero_De_Periodos;
            tabla[i][2] = tabla[i][3] + tabla[i][4];
            tabla[i][5] = tabla[i][1] - tabla[i][4];

        }

        return tabla;

    }

    public static void mostrarTablaAmortizacion(double[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");

            }
            System.out.print("\n");
        }

    }

    public static double mostrarInteresAlEnesimo(double Tasa_Interes, double[][] tabla) {
        double Sumador_Intereses = 0;
        for (int i = 0; i < tabla.length; i++) {
            Sumador_Intereses += tabla[i][3];

        }
        return Sumador_Intereses;
    }
    public static double valorTotalPagadoDelCredito(double[][] tabla){
        double Sumador_Cuotas =0;
        for (int i = 0; i < tabla.length; i++) {
            Sumador_Cuotas += tabla [i][2];
            
        }
        return Sumador_Cuotas;
        
    }
    public static double mostrarVariacionPorcentualDeInteres(double[][] tabla) {
        double Variacion_Porcentual_Interes =0;
        Variacion_Porcentual_Interes= ((tabla[tabla.length-1][3]-tabla[0][3])/tabla[0][3])*100;
        
        return Variacion_Porcentual_Interes;
        
    }
    public static double mostrarVariacionPorcentualDeCuota(double[][] tabla) {
        double Variacion_Porcentual_Cuota =0;
        Variacion_Porcentual_Cuota= ((tabla[tabla.length-1][2]-tabla[0][2])/tabla[0][2])*100;
        
        return Variacion_Porcentual_Cuota;
    }

}
