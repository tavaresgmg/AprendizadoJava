package main.java;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem (String nome, double preco, int quantidade){
        this.carrinho.add(new Item (nome, preco, quantidade));
    }

    public void removerItem (String nome){
        for(Item item : carrinho){
            if(item.getNome().equals(nome)){
                carrinho.remove(item);
                break;
            }
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item item : carrinho){
            valorTotal += (item.getPreco() * item.getQuantidade());
        }
        return valorTotal;
    }
    public void exibirItens(){
        for(Item item : carrinho){
            System.out.println("Produto: " + item.getNome() + " Preço: " + item.getPreco() + " Quantidade: " + item.getQuantidade());
        }
    }
}
