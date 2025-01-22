
package javaapplication4;

import java.util.Scanner;
public class JavaApplication4 {
    public static void main(String[] args) {
        int n1,n2,suma;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingresar Numero 1:");
        n1 = lectura.nextInt();
        System.out.println("Ingresar Numero 2");
        n2 = lectura.nextInt();
        suma  =n1 + n2;
        System.out.println("Resultado:"+suma);
        
    }
}
