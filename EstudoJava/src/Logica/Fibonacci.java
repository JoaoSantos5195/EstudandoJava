package Logica;

public class Fibonacci {
    public static void main(String[] args) {
        int numeros[] = new int[15];
        int a,b;
        a = 1;
        b = 1;
        numeros[0] = a;
        numeros[1] = b;
        for (int i = 2; i < numeros.length; i++) {
            numeros[i] = numeros[i-1]+numeros[i-2];
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }


    }
}
