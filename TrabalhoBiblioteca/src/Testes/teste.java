package Testes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import Biblioteca.*;

class teste {

	UtilizadoresFactory utilFac;
	PublicacoesFactory pubFac;
	GereUtilizador gereUtil;
	GerePublicacoes gerePub;
	GereRequisicoes gereRequi;
	
	
	@BeforeEach
	@DisplayName("inicializar as variaveis")
	void setup() 
	{
		utilFac = new UtilizadoresFactory();
		pubFac =  new PublicacoesFactory();
		gereUtil = new GereUtilizador(utilFac);
		gerePub = new GerePublicacoes(pubFac);
		gereRequi = new GereRequisicoes();
	}
	
	
	@ParameterizedTest
	@CsvSource({"'Andre', 201604342,'Doutoramento', 'Sim'", "'Bruno', 38882, 'Licenciatura', 'Nao'"})
	@DisplayName("teste de inserção de utilizador interno")
	void testAdicionarUserInterno(String nome, int numUtilizador, String tipo, String alunoSN ) 
	{
			
			gereUtil.adicionarUtilizadorInterno(nome, numUtilizador, tipo, alunoSN);
			assertNotNull(gereUtil.existeUtilizador(numUtilizador));
	}
	
	@ParameterizedTest
	@CsvSource({"'Luis', 201604342, 12345678", "'Diogo', 38882, 12345677"})
	@DisplayName("teste de inserção de utilizador externo")
	void testAdicionarUserExterno(String nome, int numUtilizador,  double numCC) 
	{
			
			gereUtil.adicionarUtilizadorExterno(nome, numUtilizador, numCC);
			assertNotNull(gereUtil.existeUtilizador(numUtilizador));
	}
	
	@ParameterizedTest
	@CsvSource({"'Luis', 201604342, 12345678", "'Diogo', 38882, 12345677"})
	@DisplayName("teste para remover aluno")
	void testRemoveAluno(String nome, int numUtilizador,  double numCC)
	{
		gereUtil.adicionarUtilizadorExterno(nome, numUtilizador, numCC);
		assertNotNull(gereUtil.existeUtilizador(numUtilizador));
		
		gereUtil.removeUtilizador(numUtilizador);
		assertNull(gereUtil.existeUtilizador(numUtilizador));
	}
	
	@ParameterizedTest
	@CsvSource({"'Livro', 201604342,'Joao', 'Areal', 'As Flores', 2019", "'Revista', 201604354, 'Miguel', 'Porto Editora', 'Vida sem Cancer', 2020"})
	@DisplayName("teste de inserção de publicacao")
	void testAdicionarPublicacao(String tipoPublicacao, int isbn, String autor, String editora, String titulo, int ano)
	{
			
			gerePub.adicionarPublicacao(tipoPublicacao, isbn, autor, editora, titulo, ano);
			assertNotNull(gerePub.existePublicacao(isbn));
	}
	
	@ParameterizedTest
	@CsvSource({"'Livro', 201604342,'Joao', 'Areal', 'As Flores', 2019", "'Revista', 201604354, 'Miguel', 'Porto Editora', 'Vida sem Cancer', 2020"})
	@DisplayName("teste para remover de publicacao")
	void testRemovePublicacao(String tipoPublicacao, int isbn, String autor, String editora, String titulo, int ano) 
	{
			gerePub.adicionarPublicacao(tipoPublicacao, isbn, autor, editora, titulo, ano);
			assertNotNull(gerePub.existePublicacao(isbn));
		
			gerePub.removePublicacao(isbn);
			assertNull(gerePub.existePublicacao(isbn));
	}
	
	@ParameterizedTest
	@CsvSource({"'Livro', 201604342,'Joao', 'Areal', 'As Flores', 2019", "'Revista', 201604354, 'Miguel', 'Porto Editora', 'Vida sem Cancer', 2020"})
	@DisplayName("teste de procura por autor")
	void testProcuraAutor(String tipoPublicacao, int isbn, String autor, String editora, String titulo, int ano)
	{	
			ArrayList<Publicacao> pTeste = new ArrayList<Publicacao>();
			if(tipoPublicacao.equalsIgnoreCase("Livro"))
			{
				pTeste.add(new Livro(isbn, autor, editora, titulo, ano));
			}
			else if(tipoPublicacao.equalsIgnoreCase("Revista"))
			{
				pTeste.add(new Revista(isbn, autor, editora, titulo, ano));
			}
			else if(tipoPublicacao.equalsIgnoreCase("Artigo"))
			{
				pTeste.add(new Artigo(isbn, autor, editora, titulo, ano));
			}
			else
			{
				pTeste.add(new Tese(isbn, autor, editora, titulo, ano));
			}
			
			gerePub.adicionarPublicacao(tipoPublicacao, isbn, autor, editora, titulo, ano);
			assertEquals(pTeste.get(0).getIsbn(), gerePub.procuraAutor(autor).get(0).getIsbn());
	}
	
	@ParameterizedTest
	@CsvSource({"'Livro', 201604342,'Joao', 'Areal', 'As Flores', 2019", "'Revista', 201604354, 'Miguel', 'Porto Editora', 'Vida sem Cancer', 2020"})
	@DisplayName("teste de procura por titulo")
	void testProcuraTitulo(String tipoPublicacao, int isbn, String autor, String editora, String titulo, int ano)
	{	
			ArrayList<Publicacao> pTeste = new ArrayList<Publicacao>();
			if(tipoPublicacao.equalsIgnoreCase("Livro"))
			{
				pTeste.add(new Livro(isbn, autor, editora, titulo, ano));
			}
			else if(tipoPublicacao.equalsIgnoreCase("Revista"))
			{
				pTeste.add(new Revista(isbn, autor, editora, titulo, ano));
			}
			else if(tipoPublicacao.equalsIgnoreCase("Artigo"))
			{
				pTeste.add(new Artigo(isbn, autor, editora, titulo, ano));
			}
			else
			{
				pTeste.add(new Tese(isbn, autor, editora, titulo, ano));
			}
			
			gerePub.adicionarPublicacao(tipoPublicacao, isbn, autor, editora, titulo, ano);
			assertEquals(pTeste.get(0).getIsbn(), gerePub.procuraTitulo(titulo).get(0).getIsbn());
	}
	
	@ParameterizedTest
	@CsvSource({"'Livro', 201604342,'Joao', 'Areal', 'As Flores', 2019", "'Revista', 201604354, 'Miguel', 'Porto Editora', 'Vida sem Cancer', 2020"})
	@DisplayName("teste de procura por editora")
	void testProcuraEditora(String tipoPublicacao, int isbn, String autor, String editora, String titulo, int ano)
	{	
			ArrayList<Publicacao> pTeste = new ArrayList<Publicacao>();
			if(tipoPublicacao.equalsIgnoreCase("Livro"))
			{
				pTeste.add(new Livro(isbn, autor, editora, titulo, ano));
			}
			else if(tipoPublicacao.equalsIgnoreCase("Revista"))
			{
				pTeste.add(new Revista(isbn, autor, editora, titulo, ano));
			}
			else if(tipoPublicacao.equalsIgnoreCase("Artigo"))
			{
				pTeste.add(new Artigo(isbn, autor, editora, titulo, ano));
			}
			else
			{
				pTeste.add(new Tese(isbn, autor, editora, titulo, ano));
			}
			
			gerePub.adicionarPublicacao(tipoPublicacao, isbn, autor, editora, titulo, ano);
			assertEquals(pTeste.get(0).getIsbn(), gerePub.procuraEditora(editora).get(0).getIsbn());
	}
	
	@ParameterizedTest
	@CsvSource({"'Livro', 201604342,'Joao', 'Areal', 'As Flores', 2019, 'Andre', 201604342,'Doutoramento', 'Sim', 123", "'Revista', 201604354, 'Miguel', 'Porto Editora', 'Vida sem Cancer', 2020, 'Andre', 201604342,'Doutoramento', 'Sim', 135"})
	@DisplayName("teste de adicionar requisicao")
	void testAdicionarRequisicao(String tipoPublicacao, int isbn, String autor, String editora, String titulo, int ano, String nome, int numUtilizador, String tipo, String alunoSN , int codigo)
	{	
	
			gerePub.adicionarPublicacao(tipoPublicacao, isbn, autor, editora, titulo, ano);
			gereUtil.adicionarUtilizadorInterno(nome, numUtilizador, tipo, alunoSN);
			
			gereRequi.adicionarRequisicao(gereUtil.existeUtilizador(numUtilizador), gerePub.procuraPublicacao(isbn), codigo);
			
			assertNotNull(gereRequi.procuraRequisicao(codigo));
	}
	
	@ParameterizedTest
	@CsvSource({"'Livro', 201604342,'Joao', 'Areal', 'As Flores', 2019, 'Andre', 201604342,'Doutoramento', 'Sim', 123, 0.5, 20", "'Revista', 201604354, 'Miguel', 'Porto Editora', 'Vida sem Cancer', 2020, 'Andre', 201604342,'licenciatura', 'Sim', 135, 0.5, 7"})
	@DisplayName("teste de adicionar requisicao")
	void testCalculoCoimaEDias(String tipoPublicacao, int isbn, String autor, String editora, String titulo, int ano, String nome, int numUtilizador, String tipo, String alunoSN , int codigo, double coima, int dias)
	{	
	
			gerePub.adicionarPublicacao(tipoPublicacao, isbn, autor, editora, titulo, ano);
			gereUtil.adicionarUtilizadorInterno(nome, numUtilizador, tipo, alunoSN);
			
			gereRequi.adicionarRequisicao(gereUtil.existeUtilizador(numUtilizador), gerePub.procuraPublicacao(isbn), codigo);
			
			assertEquals(gereRequi.procuraRequisicao(codigo).getCoima(), coima);
			assertEquals(gereRequi.procuraRequisicao(codigo).getPeriodoEmprestimo(), dias);
	}
	
}//fim class test
