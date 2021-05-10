package Biblioteca;

import java.util.ArrayList;

public class GereUtilizador 
{
	private ArrayList<Utilizador> utilizadores;
	private Utilizador user; 
	/**
	 * @param utilizadores
	 */
	public GereUtilizador() {
		this.utilizadores = new ArrayList<Utilizador>();
	}
	
	public void addUtilizadorInterno(String tipouser, String nome, int numA)
	{user = new Utilizador()
		utilizadores.add(utilizador);
	}
	
	public void AddUtilizadorExterno() {
		
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
