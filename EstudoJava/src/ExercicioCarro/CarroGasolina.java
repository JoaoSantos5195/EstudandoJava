package ExercicioCarro;

import java.util.Scanner;

public class CarroGasolina extends VeiculoBase implements AbastecerInterface, VeiculoInterface {
    Scanner sc = new Scanner(System.in);
    @Override
    public void abastecer() {
        System.out.println("Você está abastecendo com gasolina");
    }

    @Override
    public void ligarVeiculo() {
        System.out.println("Você quer ligar o carro?");
        int chave = sc.nextInt();
        String resposta = status(chave);
        System.out.println(resposta);
    }

    @Override
    public void desligarVeiculo() {
        System.out.println("Você quer desligar o carro?");
        int chave = sc.nextInt();
        String resposta = status(chave);
        System.out.println(resposta);
    }

    @Override
    public void acelerar() {
        
    }
}
