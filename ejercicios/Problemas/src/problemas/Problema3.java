/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double n4;
        System.out.println("Ingrese la nota 1");
        n1 = entrada.nextDouble();
        System.out.println("Ingrese la nota 2");
        n2 = entrada.nextDouble();
        System.out.println("Ingrese la nota 3");
        n3 = entrada.nextDouble();
        System.out.println("Ingrese la nota 4");
        n4 = entrada.nextDouble();
        String promedio = promedios(n1, n2, n3, n4);
    }

    public static String promedios(double a, double b, double c, double d) {
        double suma = a + b + c + d;
        double promedio = suma / 4;
        String mensaje = "";
        if (promedio > 0 || promedio < 5) {
            mensaje = "El promedio de notas:" + a + " " + b + " " + c + " " + d
                    + " " + "es Regular";
            System.out.printf("%s", mensaje);

        } else {
            if (promedio > 5.1 || promedio < 8) {
                mensaje = "El promedio de notas:" + a + " " + b + " " + c + " "
                        + d + " "
                        + "es Bueno";
                System.out.printf("%s", mensaje);

            } else {
                if (promedio > 8.1 || promedio < 9) {
                    mensaje = "El promedio de notas:" + a + " " + b + " "
                            + c + " " + d
                            + "es Muy Bueno";
                    System.out.printf("%s", mensaje);

                } else {
                    if (promedio > 9.1 || promedio < 10) {
                        mensaje = "El promedio de notas:" + a + " " + b
                                + " " + c + " " + d
                                + "es Sobresaliente";
                        System.out.printf("%s", mensaje);
                    }
                }
            }
        }
        return mensaje;

    }

}
