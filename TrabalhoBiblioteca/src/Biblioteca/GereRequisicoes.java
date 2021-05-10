package Biblioteca;

import java.util.ArrayList;

public class GereRequisicoes 
{
	private ArrayList<Requisicao> requisicoes;

	public GereRequisicoes() {
		this.requisicoes = new ArrayList<Requisicao>();
	}
	
	public void adicionarRequisicao(Utilizador utilizador, Publicacao publicacao, int codigo)
	{
		double coima = 0;
		int dias = 0;
		if(publicacao.getAtualState()!=publicacao.getRequisitadoState())
		{
			if(utilizador instanceof Externo)
		    {
		        coima = 1;
		        dias = 4;
		    }
			else if (utilizador instanceof Interno)
			{
				if(((Interno) utilizador).getAlunoSN().equalsIgnoreCase("Sim"))
				{
					coima = 0.5;
				}
				
				if(((Interno) utilizador).getTipo().equalsIgnoreCase("Licenciatura") || ((Interno) utilizador).getTipo().equalsIgnoreCase("Colaborador"))
				{
					dias=7;
				} 
				else if (((Interno) utilizador).getTipo().equalsIgnoreCase("Mestrado"))
				{
					dias=15;
				}
				else if(((Interno) utilizador).getTipo().equalsIgnoreCase("Doutoramento") || ((Interno) utilizador).getTipo().equalsIgnoreCase("Pos-Doutoramento") || ((Interno) utilizador).getTipo().equalsIgnoreCase("Investigador") || ((Interno) utilizador).getTipo().equalsIgnoreCase("Docente"))
				{
					dias=20;
				}
			}
			publicacao.requisitarPublicacao();
			requisicoes.add(new Requisicao(publicacao, utilizador, coima, dias, codigo));
		}
		else
		{
			System.out.println("Nao pode requisitar esta publicacao.");
		}
	}
	
	public Requisicao procuraRequisicao(int codigo)
	{
		for(Requisicao r :requisicoes)
		{
			if(r.getCodigo()==codigo)
			{
				return r;
			}
		}
		return null;
	}
	
}
