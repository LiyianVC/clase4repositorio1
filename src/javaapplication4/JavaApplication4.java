
package javaapplication4;

import java.util.Scanner;
public class JavaApplication4 {
    public static void main(String[] args) {
        int n1, n2, n3, n4, suma;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingresar Numero 1:");
        n1 = lectura.nextInt();
        System.out.println("Ingresar Numero 2:");
        n2 = lectura.nextInt();
        System.out.println("Ingresar Numero 3:");
        n3 = lectura.nextInt();
        System.out.println("Ingresar Numero 4:");
        n4 = lectura.nextInt();
        suma = n1 + n2 + n3 +n4;
        System.out.println("Resultado:"+suma);
        
    }
}
