package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Biblioteca.*;

class teste {

	UtilizadoresFactory userfac;
	PublicacoesFactory pubfac;
	GereUtilizador gereuser;
	GerePublicacoes gerepub;
	@BeforeEach
	@DisplayName("inicializar as variaveis")
	void setup() {
		userfac = new UtilizadoresFactory();
		pubfac =  new PublicacoesFactory();
	}
	
	@ParameterizedTest
	@CsvSource({"'Externo', 'Luis', 201604342", "'Interno', 'Diogo', 38882"})
	@DisplayName("teste de inserção de utilizador")
	void testAdicionarUser(String tipo,String nome, int numA ) {
			
			gereuser.addUtilizador(utilizador);
			
	}
	
}
