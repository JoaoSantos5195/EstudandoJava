package Jogos;

import java.util.Random;

public class JogoDadoMaior {
    public static void main(String[] args) {
        int pontosH = 0;
        int pontosPc = 0;
        int jogadasMax = 0;

        do {

            Random r = new Random();
            int jogada1 = r.nextInt(1, 6);
            int jogada2 = r.nextInt(1, 6);

            int jogadaPc = jogada1;
            System.out.println("O computador jogou: " + jogadaPc);
            System.out.println("Sua vez ");
            int jogadaH = jogada2;
            System.out.println("Você jogou: " + jogadaH);

            if (jogadaH > jogadaPc) {
                pontosH++;
            } else {
                pontosPc++;
            }

            System.out.println("====PLACAR====");
            System.out.println("Humano: " + pontosH);
            System.out.println("Máquina " + pontosPc);
            System.out.println("===============");

            jogadasMax++;

        } while (pontosH < 3 && pontosPc < 3 || jogadasMax != 5);

        if (pontosH>pontosPc) {
            System.out.println("Parabéns os humanos ganharam");
        }else{
            System.out.println("As máquinas venceram");
        }
    }
}
