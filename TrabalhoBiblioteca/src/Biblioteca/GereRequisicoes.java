package Biblioteca;

import java.util.ArrayList;

public class GereRequisicoes 
{
	private ArrayList<Requisicao> requisicoes;

	public GereRequisicoes() {
		this.requisicoes = new ArrayList<Requisicao>();
	}
	
	public void adicionarRequisicao(Utilizador utilizador, Publicacao publicacao)
	{
		double coima = 0;
		int dias = 0;
		if(utilizador instanceof Externo)
	    {
	        coima = 1;
	        dias = 4;
	    }
		else if (utilizador instanceof Interno)
		{
			«
		}
		requisicoes.add(new Requisicao(publicacao, utilizador, coima, dias));
	}
	
	/*if(utilizador instanceof UtilizadorExterno)
    {
        req.setCoima(1);
        req.setPeriodoEmprestimo(4);
    }
    else if (utilizador instanceof Aluno)
    {
        String tipo = ((Aluno) utilizador).getTipoEstudo();
        if(tipo.equalsIgnoreCase("Mestrado"))
        {
            req.setCoima(0.5);
            req.setPeriodoEmprestimo(15);
        } else if (tipo.equalsIgnoreCase("Doutoramento") && tipo.equalsIgnoreCase("Pos-Doutoramento"))
                {
            req.setCoima(0.5);
            req.setPeriodoEmprestimo(20);
                }
                else
                {
                    req.setCoima(0.5);
                    req.setPeriodoEmprestimo(7);
                }
    }
    else if (utilizador instanceof Staff)
    {
        req.setPeriodoEmprestimo(20);
    }*/
}
