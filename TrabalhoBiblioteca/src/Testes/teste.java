package Testes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Biblioteca.*;

class teste {

	UtilizadoresFactory utilFac;
	PublicacoesFactory pubFac;
	GereUtilizador gereUtil;
	GerePublicacoes gerePub;
	
	
	@BeforeEach
	@DisplayName("inicializar as variaveis")
	void setup() {
		utilFac = new UtilizadoresFactory();
		pubFac =  new PublicacoesFactory();
		gereUtil = new GereUtilizador(utilFac);
		gerePub = new GerePublicacoes(pubFac);
	}
	
	
	@ParameterizedTest
	@CsvSource({"'Andre', 201604342,'Doutoramento', 'Sim'", "'Bruno', 38882, 'Licenciatura', 'Nao'"})
	@DisplayName("teste de inserção de utilizador interno")
	void testAdicionarUserInterno(String nome, int numUtilizador, String tipo, String alunoSN ) {
			
			gereUtil.adicionarUtilizadorInterno(nome, numUtilizador, tipo, alunoSN);
			assertTrue(gereUtil.existeUtilizador(numUtilizador));
	}
	
	@ParameterizedTest
	@CsvSource({"'Luis', 201604342, 12345678", "'Diogo', 38882, 12345677"})
	@DisplayName("teste de inserção de utilizador externo")
	void testAdicionarUserExterno(String nome, int numUtilizador,  double numCC) {
			
			gereUtil.adicionarUtilizadorExterno(nome, numUtilizador, numCC);
			assertTrue(gereUtil.existeUtilizador(numUtilizador));
	}
	
	@ParameterizedTest
	@CsvSource({"'Luis', 201604342, 12345678", "'Diogo', 38882, 12345677"})
	@DisplayName("teste para remover aluno")
	void testRemoveAluno(String nome, int numUtilizador,  double numCC)
	{
		gereUtil.adicionarUtilizadorExterno(nome, numUtilizador, numCC);
		assertTrue(gereUtil.existeUtilizador(numUtilizador));
		
		gereUtil.removeUtilizador(numUtilizador);
		assertFalse(gereUtil.existeUtilizador(numUtilizador));
	}
}
