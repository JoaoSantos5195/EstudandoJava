package Logica;

import java.util.Scanner;

public class VerificaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] vetor = new float[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero");
            float numero = sc.nextInt();
            vetor[i] = numero;
        }
        System.out.println("Posições de números pares");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                System.out.println("Número: " + vetor[i] + " que está na " + (i + 1) + "º posição");
            }
        }
    }
}

