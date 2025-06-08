package Jogos;

import java.util.Random;
import java.util.Scanner;

public class JogoDado {
    public static void main(String[] args) {
        int pontosH = 0;
        int pontosPc = 0;
        Random r = new Random();

        Scanner sc = new Scanner(System.in);

        do {
            int jogadaPc = r.nextInt(1, 6);
            System.out.println(pontosH);
            System.out.println(pontosPc);

            System.out.println("Escolha um número de 1 a 6 ");
            int jogadaH = sc.nextInt();

            if (jogadaH < 1 || jogadaH > 6) {
                System.out.println("Jogada inválida");
            }
            System.out.println("O computador escolheu " + jogadaPc);
            if (jogadaH == jogadaPc) {
                pontosH++;
            } else {
                pontosPc++;
            }
            System.out.println("PONTUAÇÃO TOTAL: ");
            System.out.println("Humano: " + pontosH);
            System.out.println("Máquina: " + pontosPc);

        }while(pontosH < 3 && pontosPc < 3);

        sc.close();

        if (pontosH == 3) {
            System.out.println("Você venceu! Parabéns!");
        } else {
            System.out.println("O computador venceu! Tente novamente.");
        }
    }
}
