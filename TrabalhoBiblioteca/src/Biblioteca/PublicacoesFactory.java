package Biblioteca;

import java.util.Scanner;



public class PublicacoesFactory {

	public Publicacao criarPublicacao(String tipoPublicacao, int isbn, String autor, String editora, String titulo, int ano) {
		Publicacao publicacao = null;
	
		if(tipoPublicacao.equalsIgnoreCase("Livro"))
		{
			publicacao = new Livro(isbn,autor,editora,titulo,ano);
		}
		else if (tipoPublicacao.equalsIgnoreCase("Artigo"))
		{
			publicacao = new Artigo(isbn,autor,editora,titulo,ano);
		}
		else if(tipoPublicacao.equalsIgnoreCase("Tese"))
		{
			publicacao = new Tese(isbn,autor,editora,titulo,ano);
		}
		else 
		{
			publicacao = new Revista(isbn,autor,editora,titulo,ano);
		}
		
		return publicacao;
	}
}
