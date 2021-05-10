package Biblioteca;

public class Requisicao 
{
	private Publicacao publicacao;
	private Utilizador utilizador;
	private double coima;
	private int periodoEmprestimo;
	private int codigo;
	/**
	 * @param livro
	 * @param utilizador
	 * @param coima
	 * @param periodoEmprestimo
	 */
	public Requisicao(Publicacao publicacao, Utilizador utilizador, double coima, int periodoEmprestimo, int codigo)
	{
		this.publicacao = publicacao;
		this.utilizador = utilizador;
		this.coima = coima;
		this.periodoEmprestimo = periodoEmprestimo;
		this.codigo=codigo;
	}
	/**
	 * @return the documento
	 */
	public Publicacao getPublicacao() {
		return publicacao;
	}


	/**
	 * @param documento the documento to set
	 */
	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}


	/**
	 * @return the utilizador
	 */
	public Utilizador getUtilizador() {
		return utilizador;
	}
	/**
	 * @param utilizador the utilizador to set
	 */
	public void setUtilizador(Utilizador utilizador) {
		this.utilizador = utilizador;
	}
	/**
	 * @return the coima
	 */
	public double getCoima() {
		return coima;
	}
	/**
	 * @param coima the coima to set
	 */
	public void setCoima(double coima) {
		this.coima = coima;
	}
	/**
	 * @return the periodoEmprestimo
	 */
	public int getPeriodoEmprestimo() {
		return periodoEmprestimo;
	}
	/**
	 * @param periodoEmprestimo the periodoEmprestimo to set
	 */
	public void setPeriodoEmprestimo(int periodoEmprestimo) {
		this.periodoEmprestimo = periodoEmprestimo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
}
