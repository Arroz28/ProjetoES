package Biblioteca;

import java.util.ArrayList;

public class GereUtilizador 
{
	private ArrayList<Utilizador> utilizadores;
	private Utilizador user;
	private UtilizadoresFactory utifac;
	/**
	 * @param utilizadores
	 */
	public GereUtilizador(UtilizadoresFactory utifac) {
		this.utilizadores = new ArrayList<Utilizador>();
		this.utifac=utifac;
	}
	
	public void addUtilizadorInterno(String nome, int numUtilizador, String tipo, String alunoSN)
	{
		Utilizador utilizador = utifac.criarUtilizadorInterno(nome, numUtilizador, tipo, alunoSN);
		utilizadores.add(utilizador);
	}
	 
	public void AddUtilizadorExterno(String nome, int numUtilizador,  double numCC) {
		Utilizador utilizador = utifac.criarUtilizadorExterno(nome, numUtilizador, numCC);
		utilizadores.add(utilizador);
	}
	
	public void removeUtilizador(int num)
	{
		if(utilizadores.isEmpty())
		{
			System.out.println("Nao ha utilizadores");
		}
		else
		{
			for(Utilizador u :utilizadores)
			{
				if(u.getNumUtilizador()==num)
				{
					utilizadores.remove(u);
				}
			}
		}
	}
}
