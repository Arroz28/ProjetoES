package Biblioteca;

public class RequisitadoState implements PublicacaoState
{
	public void requisitarPublicacao(Publicacao publicacao)
	{
		
		System.out.println("Nao pode requisitar esta publicacao.");
	}
	
	public void devolverPublicacao(Publicacao publicacao)
	{
		System.out.println("Esta publicacao foi devolvida");
		publicacao.setAtualState(publicacao.getDisponivelState());
	}

}
