package Biblioteca;

public class Interno extends Utilizador
{
	private String alunoSN;
	private String tipo;

	/**
	 * @param nome
	 * @param numUtilizador
	 * @param numMaxReq
	 * @param newsletter
	 * @param tipoEstudo
	 */
	public Interno(String nome, int numUtilizador, String tipo, String alunoSN) {
		super(nome, numUtilizador);
		this.tipo = tipo;
		this.alunoSN = alunoSN;
	}

	/**
	 * @return the tipoEstudo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipoEstudo the tipoEstudo to set
	 */
	public void setTipo(String Tipo) {
		this.tipo = tipo;
	}

	public String getAlunoSN() {
		return alunoSN;
	}

	public void setAlunoSN(String alunoSN) {
		this.alunoSN = alunoSN;
	}

	


	
}