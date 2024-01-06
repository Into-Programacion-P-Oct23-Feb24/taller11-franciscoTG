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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int res;
        String nom;
        String ced;
        System.out.println("Ingrese su nombre");
        nom = entrada.nextLine();
        System.out.println("Ingrese su número de cédula");
        ced = entrada.nextLine();
        System.out.println("Si desea obtener su planilla de luz digite 1 si "
                + "desea valor de su predio digite 2");
        res = entrada.nextInt();
        if (res == 1) {
            calcularValorLuz(nom, ced);
        } else {
            if (res == 2) {
                calcularPredio(nom, ced);
            }
        }
    }

    public static void calcularValorLuz(String nom, String ced) {
        Scanner entrada = new Scanner(System.in);
        double kilo;
        double numk;
        System.out.println("Ingrese el valor del kilowatio");
        kilo = entrada.nextDouble();
        System.out.println("Ingrese el valor de kilowatios consumidos");
        numk = entrada.nextDouble();
        double valort;
        valort = (kilo * numk);
        System.out.printf("Cliente: %s con cedula: %s debe cancelar el"
                + " valor de: $%.2f", nom, ced, valort);

    }

    public static void calcularPredio(String nom, String ced) {
        Scanner entrada = new Scanner(System.in);
        double resultado;
        double mueble;
        System.out.println("Ingrese el valor del inmueble");
         mueble = entrada.nextDouble();
         resultado = mueble - (mueble * 0.2);
         System.out.printf("Cliente: %s con cédula: %s tiene un inmueble "
                 + "valorado en: $%.2f y tiene que pagar un predio de: $%.2f",
                 nom,ced,mueble,resultado);
    }
}
