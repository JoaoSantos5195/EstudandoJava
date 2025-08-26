package ExercicioCarro;

import java.util.Random;
import java.util.Scanner;

public class CarroGasolina extends VeiculoBase implements AbastecerInterface, VeiculoInterface {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    @Override
    public void abastecer() {
        System.out.println("Você está abastecendo com gasolina");
    }

    @Override
    public void ligarVeiculo() {
        System.out.println("Você quer ligar o carro?[1]Sim [0]Desligar");
        int chave = sc.nextInt();
        String resposta = status(chave);
        System.out.println(resposta);
    }

    @Override
    public void desligarVeiculo() {
        System.out.println("Você quer desligar o carro?[0]Sim [1]Ligar");
        int chave = sc.nextInt();
        String resposta = status(chave);
        System.out.println(resposta);
    }

    @Override
    public void acelerar() {
        System.out.println("Quanto vc quer acelerar?");
        System.out.println("[1] 30kmh");
        System.out.println("[2] 60kmh");
        System.out.println("[3] 90kmh");
        int acelero = sc.nextInt();
        String batida;
        switch (acelero) {
            case 1:
                batida = Math.random() >= 0.2 ? "Você está a 20km/h. Seguro." : "Você bateu";
                break;
            case 2:
                batida = Math.random() >= 0.5 ? "Você está a 60km/h. Seguro." : "Você bateu";
                break;
            case 3:
                batida = Math.random() >= 0.8 ? "Você está a 90km/h. Seguro." : "Você bateu e morreu";
                break;
            default:
                System.out.println("Escolha incorreta");
                break;
        }

    }
}
