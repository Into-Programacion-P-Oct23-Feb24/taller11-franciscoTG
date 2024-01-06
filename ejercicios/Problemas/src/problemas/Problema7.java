/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author reroes
 */
public class Problema7 {
    
public static void main(String[] args) {
        String[] men;
        men = obtenerMensaje();
        System.out.println("Valores");
        for (int i = 0; i < men.length; i++) {
            System.out.println(men[i]);

        }
        System.out.println("Valores de  4 a 5 carácteres");
        obtenerValores(men);
    }

    public static String[] obtenerMensaje() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int num;
        System.out.println("Ingrese el numero de datos");
        num = entrada.nextInt();
        String[] men = new String[num];
        entrada.nextLine();
        for (int i = 0; i < men.length; i++) {
            System.out.println("Ingrese la ciudad de Ecuador");
            men[i] = entrada.nextLine();
        }
        return men;
    }

    public static void obtenerValores(String[] valores) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i].length() == 4 || valores[i].length() == 5) {
                System.out.println(valores[i]);

            }

        }

    }
}
