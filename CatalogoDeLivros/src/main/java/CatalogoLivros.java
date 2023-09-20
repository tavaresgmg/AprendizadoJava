package com.catalogodelivros;
import java.util.ArrayList;

public class CatalogoLivros {
    private ArrayList<Livro> livros;

    public CatalogoLivros(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
       this.livros.add(new Livro(titulo, autor, ano));
    }

    public void pesquisaPorAutor (String autor){
        boolean encontrado = false;
        for(Livro livro : livros){
            if(livro.getAutor().equals(autor)){
                encontrado = true;
                System.out.println(livro.getTitulo());
            }
        }
        if (!encontrado){
                System.out.println("Não foi encontrado nenhum livro!");
    }

    public void pesquisaPorIntervaloAnos (int anoInicial, int anoFinal){
        boolean encontrado = false;
        for(Livro livro : livros){
            if(livro.getAno() >= anoInicial && livro.getAno() <= anoFinal){
                encontrado = true;
                System.out.println(livro.getTitulo());
            } 
        }
        if (!encontrado){
                System.out.println("Não foi encontrado nenhum livro!");
    }

    public void pesquisaPorTitulo (String titulo){
        boolean encontrado = false;
        for(Livro livro : livros){
            if(livro.getTitulo().equals(titulo)){
                encontrado = true;
                System.out.println(livro.getTitulo());
                break;
            }
        }
        if (!encontrado){
                System.out.println("Não foi encontrado nenhum livro!");
    }
    
}
