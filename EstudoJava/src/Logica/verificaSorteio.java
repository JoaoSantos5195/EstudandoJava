package Logica;

import java.util.Random;
import java.util.Scanner;

public class verificaSorteio {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;
        int[] vetor = new int[15];
        int contador = 0;

        System.out.println("Digite um número 1 entre e 15");
        int num = sc.nextInt();
        System.out.printf("Números sorteados: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(1, 15);
            if (num == vetor[i]){
                encontrado = true;
            }
            System.out.print(" "+vetor[i]);
        }
        if (encontrado){
            System.out.println("\nO número digitado foi encontrado!");
        }else {
            System.out.println("\nO número digitado não foi encontrado!");
        }
        System.out.println("\nO número escolhido foi sorteado nas seguintes posições:");
        for (int i = 0; i < vetor.length; i++) {
            if (num == vetor[i]){
                System.out.printf((i+1) + "º ");
                contador++;
            }
        }
        System.out.println("\nO número aparece "+ contador + " vez(es)");
        sc.close();
    }
}
