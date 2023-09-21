package CatalogoDeLivros.src.main.java;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        CatalogoLivros catalogo = new CatalogoLivros();
        int escolha = 0;

        while(escolha !=5){
            System.out.println("1. Adicionar livro");
            System.out.println("2. Pesquisar livro por autor");
            System.out.println("3. Pesquisar livro por intervalo de anos");
            System.out.println("4. Pesquisar livro por titulo");
            System.out.println("5. Sair");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha){
                case 1:
                    System.out.println("Digite o titulo do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.println("Digite o ano do livro: ");
                    int ano = scanner.nextInt();

                    catalogo.adicionarLivro(titulo, autor, ano);
                    break;
                
                case 2: 
                    System.out.println("Digite o nome do autor: ");
                    String autorPesquisa = scanner.nextLine();
                    catalogo.pesquisaPorAutor(autorPesquisa);
                    break;

                case 3:
                    System.out.println("Digite o ano inicial: ");
                    int anoIni = scanner.nextInt();
                    System.out.println("Digite o ano final: ");
                    int anoFin = scanner.nextInt();

                    catalogo.pesquisaPorIntervaloAnos(anoIni, anoFin);
                    break;

                case 4:
                    System.out.println("Digite o titulo do livro: ");
                    String tituloPesq = scanner.nextLine();

                    catalogo.pesquisaPorTitulo(tituloPesq);
                    break;
                
                case 5:
                System.out.println("Programa Encerrado!");
                escolha = 5;
            }
        
        }
        scanner.close();
        
        
    }
}
