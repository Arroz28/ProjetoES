package Biblioteca;

import java.util.ArrayList;

public class GerePublicacoes {

	private ArrayList<Publicacao> publicacoes;

	public GerePublicacoes() {
		publicacoes = new ArrayList<Publicacao>();
	}
	
	public void addPublicacao(Publicacao publicacao)
	{
		publicacoes.add(publicacao);
	}
	
	public void removePublicacao(int isbn)
	{
		if(publicacoes.isEmpty())
		{
			System.out.println("Nao ha Publicacoes");
		}
		else
		{
			for(Publicacao p :publicacoes)
			{
				if(p.getIsbn()==isbn)
				{
					publicacoes.remove(p);
				}
			}
		}
	}
	
	
	public void consultaTitulo(String titulo)
	{
		for(Publicacao p :publicacoes)
		{
			if(p.getTitulo()==titulo)
			{
				System.out.println(p.toString());
			}
		}
	}
	
	public void consultaAutor(String autor)
	{
		for(Publicacao p :publicacoes)
		{
			if(p.getAutor()==autor)
			{
				System.out.println(p.toString());
			}
		}
	}
	
	public void consultaEditora(String editora)
	{
		for(Publicacao p :publicacoes)
		{
			if(p.getEditora()==editora)
			{
				System.out.println(p.toString());
			}
		}
	}
	
}
