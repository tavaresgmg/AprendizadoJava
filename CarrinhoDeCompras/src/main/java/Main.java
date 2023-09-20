package main.java;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        int escolha = 0;

        while(escolha != 5){
            System.out.println("1. Adicionar item");
                System.out.println("2. Remover item");
                System.out.println("3. Calcular valor total");
                System.out.println("4. Exibir itens");
                System.out.println("5. Sair");
                System.out.println("Digite a opção desejada: ");
                escolha = scanner.nextInt();
                scanner.nextLine();

            switch(escolha){
                case 1:
                System.out.println("Digite o nome do produto: ");
                String nome = scanner.nextLine();
                System.out.println("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                System.out.println("Digite a quantidade de produtos: ");
                int quantidade = scanner.nextInt();
                carrinho.adicionarItem(nome, preco, quantidade);
                break;

                case 2:
                System.out.println("Digite o nome do produto a ser removido: ");
                String nome2 = scanner.nextLine();
                carrinho.removerItem(nome2);
                break;

                case 3:
                carrinho.calcularValorTotal();
                System.out.println("Valor total:" + carrinho.calcularValorTotal());
                break;

                case 4:
                carrinho.exibirItens();
                break;

                case 5:
                escolha = 5;
                break;

                default: 
                System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}
