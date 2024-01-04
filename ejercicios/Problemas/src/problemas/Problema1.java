/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int sum = imprimirDatos(informacion);
        System.out.printf("La suma es %d\n", sum);      
    }
    public static int imprimirDatos(int[][] datos) {
        String cadenafinal = "";
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                if (datos[i][j] % 2 == 0) {
                }
                cadenafinal = String.format(" los valor pares de un arreglo son:%s ",
                        cadenafinal);
            }
            return imprimirDatos;
        }
    }
}

