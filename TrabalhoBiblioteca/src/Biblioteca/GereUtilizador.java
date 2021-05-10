package Biblioteca;

import java.util.ArrayList;

public class GereUtilizador 
{
	private ArrayList<Utilizador> utilizadores;
	private Utilizador util;
	private UtilizadoresFactory utilFac;
	/**
	 * @param utilizadores
	 */
	public GereUtilizador(UtilizadoresFactory utilFac) {
		this.utilizadores = new ArrayList<Utilizador>();
		this.utilFac = utilFac;
	}
	
	public void adicionarUtilizadorInterno(String nome, int numUtilizador, String tipo, String alunoSN)
	{
		Utilizador utilizador = utilFac.criarUtilizadorInterno(nome, numUtilizador, tipo, alunoSN);
		utilizadores.add(utilizador);
	}
	 
	public void adicionarUtilizadorExterno(String nome, int numUtilizador,  double numCC) {
		Utilizador utilizador = utilFac.criarUtilizadorExterno(nome, numUtilizador, numCC);
		utilizadores.add(utilizador);
	}
	
	public void removeUtilizador(int num)
	{
		Utilizador u = existeUtilizador(num);
		
		if(u!=null)
		{
			utilizadores.remove(u);
		}
	}//fim removeUtil
	
	public Utilizador existeUtilizador(int numUtil)
	{
		if(utilizadores.isEmpty())
		{
			System.out.println("Nao ha Utilizadores");
			return null;
		}
		else
		{
			for(Utilizador u :utilizadores)
			{
				if(u.getNumUtilizador()==numUtil)
				{
					return u;
				}
			}
		}
		return null;
	}
}//fim classe gereUtil
