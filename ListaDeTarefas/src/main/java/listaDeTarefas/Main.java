package listaDeTarefas;
import java.util.Scanner;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        ListaTarefas listaTarefas = new ListaTarefas();

        boolean continuar = true;
        while(continuar) {
            System.out.println("1: Adicionar Tarefa");
            System.out.println("2: Remover Tarefa");
            System.out.println("3: Quantidade de Tarefas");
            System.out.println("4: Listar Tarefas");
            System.out.println("5: Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                System.out.println("Insira a descrição da tarefa:");
                String descricao = scanner.nextLine();
                listaTarefas.adicionarTarefa(descricao);
                break;

                case 2:
                System.out.println("Qual tarefa deseja remover?");
                descricao = scanner.nextLine();
                listaTarefas.removerTarefa(descricao);
                break;

                case 3:
                System.out.println("Existem " + listaTarefas.obterNumeroTotalTarefas() + "tarefas na lista!");
                break;

                case 4:
                List<String> descricoes = listaTarefas.obterDescricoesTarefas();
                System.out.println(descricoes);
                break;

                case 5:
                continuar = false;
                break;

                default:
            System.out.println("Opção Inválida!");
            }
        }
    }
}