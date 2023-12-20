/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        int[][] arreglo = {{10, 41, 40}, {1, 2, 3}, {1, 12, 4}};
        int total = 0;
        for (int f = 0; f < arreglo.length; f++) {
// ciclo for para poder reconocer filas y columnas una a una
            for (int c = 0; c < arreglo[f].length; c++) {
                // length representa el número de elementos de un arreglo
                if (f == c) {
                    // filas es proporcional al número de columnas, pero en este
                    // ejercicio se sumo los números en diagonal, en este caso, 
                    // 10 4 2 
                    total = total + arreglo[f][c];
                }
            }
        }
        System.out.printf("%d\n", total);
    }
}
