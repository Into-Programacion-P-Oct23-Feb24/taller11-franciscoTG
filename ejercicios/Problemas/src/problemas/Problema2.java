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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el numero del 1 al 3");
        num = entrada.nextInt();
        if (num == 1) {
            obtenerCuadrado();
        } else {
            if (num == 2) {
                obtenerTriangulo();
            } else {
                if (num == 3) {
                    obtenerRectangulo();
                }else{
                    if(num>=4){
                        System.out.println("Error");
                    }
                }
            }
        }
    }

    public static void obtenerCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        System.out.println("Ingrese el lado");
        lado = entrada.nextDouble();
        area = lado * lado * lado;
        System.out.printf("%.2f", area);
    }

    public static void obtenerTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("%.2f", area);

    }

    public static void obtenerRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
        area = (base * altura);
        System.out.printf("%.2f", area);

    }
}
