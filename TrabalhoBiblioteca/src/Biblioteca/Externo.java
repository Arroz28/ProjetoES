package Biblioteca;

public class Externo extends Utilizador
{
	private double numCC;

	/**
	 * @param nome
	 * @param numUtilizador
	 * @param numMaxReq
	 * @param newsletter
	 * @param numCC
	 */
	public Externo(String nome, int numUtilizador,  double numCC) 
	{
		super(nome, numUtilizador);
		this.numCC = numCC;
	}

	/**
	 * @return the numCC
	 */
	public double getNumCC() {
		return numCC;
	}
	
	
}
