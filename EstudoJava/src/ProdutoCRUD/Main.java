package ProdutoCRUD;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int escolha = 0;

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do{

            System.out.println("1 - Cadastrar");
            System.out.println("2 - Exibir");
            System.out.println("3 - Editar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            escolha = sc.nextInt();
            sc.nextLine();

            switch  (escolha){
                case 1:
                    System.out.println("qual o nome do produto?\n");
                    String nome = sc.nextLine(); // OK

                    System.out.println("qual a descricao do produto?\n ");
                    String desc = sc.nextLine(); // limpa ENTER do nextShort

                    System.out.println("qual o preço do produto? ");
                    double preco = sc.nextDouble(); // OK
                    sc.nextLine(); // limpa ENTER do nextShort

                    System.out.println("qual a quantidade? ");
                    int quantidade = sc.nextInt();
                    sc.nextLine(); // limpa ENTER do nextShort

                    Produto produto = new Produto(nome, preco, desc, quantidade);
                    listaProdutos.add(produto);

                    break;
                case 2:
                    System.out.println("\nProdutos cadastrados:");
                    for (Produto p : listaProdutos) {
                        System.out.println(p);
                    }
                    System.out.println("\n==========================");

                    break;
            }
        }while(escolha != 5);
        sc.close();

    }
}