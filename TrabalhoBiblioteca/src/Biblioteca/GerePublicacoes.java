package Biblioteca;

import java.util.ArrayList;

public class GerePublicacoes {

	private ArrayList<Publicacao> publicacoes;
	private PublicacoesFactory pubFac;
	
	public GerePublicacoes(PublicacoesFactory pubFac) {
		publicacoes = new ArrayList<Publicacao>();
		this.pubFac = pubFac;
	}
	
	public void adicionarPublicacao(String tipoPublicacao, int isbn, String autor, String editora, String titulo, int ano)
	{
		Publicacao publicacao = pubFac.criarPublicacao(tipoPublicacao, isbn, autor, editora, titulo, ano);
		
		publicacoes.add(publicacao);
	}
	
	public void removePublicacao(int isbn)
	{
		Publicacao p = existePublicacao(isbn);
		
		if(p!=null)
		{
			publicacoes.remove(p);
		}
	}
	
	public Publicacao existePublicacao(int isbn)
	{
		if(publicacoes.isEmpty())
		{
			System.out.println("Nao ha Publicacoes");
			return null;
		}
		else
		{
			for(Publicacao p :publicacoes)
			{
				if(p.getIsbn()==isbn)
				{
					return p;
				}
			}
		}
		return null;
	}
	
	public ArrayList<Publicacao> procuraTitulo(String titulo)
	{
		ArrayList<Publicacao> p1 = new ArrayList<Publicacao>();
		for(Publicacao p :publicacoes)
		{
			if(p.getTitulo()==titulo)
			{
				System.out.println(p.toString());
				System.out.println("----------------------");
				p1.add(p);
			}
		}
		return p1;
	}
	
	public ArrayList<Publicacao> procuraAutor(String autor)
	{
		ArrayList<Publicacao> p1 = new ArrayList<Publicacao>();
		for(Publicacao p :publicacoes)
		{
			if(p.getAutor()==autor)
			{
				System.out.println(p.toString());
				System.out.println("----------------------");
				p1.add(p);
			}
		}
		return p1;
	}
	
	public Publicacao procuraPublicacao(int ISBN)
	{
		for(Publicacao p :publicacoes)
		{
			if(p.getIsbn()==ISBN)
			{
				return p;
			}
		}
		return null;
	}
	
	public ArrayList<Publicacao> procuraEditora(String editora)
	{
		ArrayList<Publicacao> p1 = new ArrayList<Publicacao>();
		for(Publicacao p :publicacoes)
		{
			if(p.getEditora()==editora)
			{
				System.out.println(p.toString());
				System.out.println("----------------------");
				p1.add(p);
			}
		}
		return p1;
	}
	
}
