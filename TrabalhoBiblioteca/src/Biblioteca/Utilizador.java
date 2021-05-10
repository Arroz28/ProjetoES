package Biblioteca;

public abstract class Utilizador 
{
	private String nome;
	private int numUtilizador;
	
	/**
	 * @param nome
	 * @param numUtilizador
	 * @param numMaxReq
	 */
	public Utilizador(String nome, int numUtilizador) {
		super();
		this.nome = nome;
		this.numUtilizador = numUtilizador;

	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the numUtilizador
	 */
	public int getNumUtilizador() {
		return numUtilizador;
	}
	/**
	 * @return the numMaxReq
	 */

	
}
