package Jogos;

import java.util.Scanner;

public class CaraOuCoroa {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você quer cara ou coroa? ");
        String resp = scanner.nextLine();
        String escolha = resp.toLowerCase();
        String palavra = Math.random() < 0.5 ? "coroa" : "cara";

        System.out.println("Lançando...");
        Thread.sleep(2000);
        System.out.println("O resultado é... ");
        Thread.sleep(300);
        System.out.println(palavra);

        if (escolha.equals("coroa")){
            if (palavra.equals("coroa")){
                System.out.println("Parabéns vc ganhou!");
            }else{
                System.out.println("Vish perdeu");
            }
        }else if (escolha.equals("cara")){
            if (palavra.equals("cara")){
                System.out.println("Parabéns vc ganhou!");
            }else{
                System.out.println("Vish perdeu");
            }
        }else{
            System.out.println("Escolha inválida");
        }

        scanner.close();
    }
}
