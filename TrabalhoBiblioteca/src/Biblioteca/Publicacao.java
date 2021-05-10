package Biblioteca;

public abstract class Publicacao {

	private int isbn;
	private String autor;
	private String editora;
	private String titulo;
	private int ano;
	
	private PublicacaoState disponivelState;
	private PublicacaoState requisitadoState;
	private PublicacaoState atualState;
	
	
	public Publicacao(int isbn, String autor, String editora, String titulo, int ano) 
	{
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
		this.titulo = titulo;
		this.ano = ano;
		
		this.disponivelState = new DisponivelState();
		this.requisitadoState = new RequisitadoState();
		this.atualState = new DisponivelState();
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public PublicacaoState getAtualState() {
		return atualState;
	}


	public void setAtualState(PublicacaoState atualState) {
		this.atualState = atualState;
	}


	public PublicacaoState getDisponivelState() {
		return disponivelState;
	}


	public PublicacaoState getRequisitadoState() {
		return requisitadoState;
	}


	public void requisitarPublicacao()
	{
		
	}

	@Override
	public String toString() {
		return "Publicacao [isbn=" + isbn + ", autor=" + autor + ", editora=" + editora + ", titulo=" + titulo
				+ ", ano=" + ano + "]";
	}

	
}
