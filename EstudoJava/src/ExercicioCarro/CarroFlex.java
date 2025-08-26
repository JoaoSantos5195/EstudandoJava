package ExercicioCarro;

import java.util.Scanner;

public class CarroFlex extends VeiculoBase implements RecarregarInterface, AbastecerInterface, VeiculoInterface {

    Scanner sc = new Scanner(System.in);


    @Override
    public void abastecer() {
        System.out.println("Você está abastecendo com gasolina");
    }
    @Override
    public void recarregar() {
        System.out.println("Você colocou seu carro na tomada");
    }

    public void abastecimento(){
        System.out.println("Quer abastecer com Gasolina[1] ou eletricidade[2]?");
        int escolhaAbastecimento = sc.nextInt();
        switch (escolhaAbastecimento){
            case 1:
                abastecer();
                break;
            case 2:
                recarregar();
                break;
            default:
                System.out.println("Escolha inválida");
                break;
        }
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