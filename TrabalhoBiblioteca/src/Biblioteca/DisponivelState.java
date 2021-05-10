package Biblioteca;

public class DisponivelState implements PublicacaoState
{
	public void requisitarPublicacao(Publicacao publicacao)
	{
		System.out.println("Esta publicacao foi requisitada.");
		publicacao.setAtualState(publicacao.getRequisitadoState());
	}
	
	public void devolverPublicacao(Publicacao publicacao)
	{
		System.out.println("Nao pode devolver esta publicacao porque nao a tinha requisitado");
		
	}

}
