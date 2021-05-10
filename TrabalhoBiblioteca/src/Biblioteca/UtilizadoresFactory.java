package Biblioteca;

import java.util.Scanner;


public class UtilizadoresFactory {
	
	Scanner input = new Scanner (System.in);

	public Utilizador criarUtilizadorInterno(String nome, int numUtilizador, String tipo, String alunoSN) {
		Utilizador utilizador = null;

		utilizador = new Interno(nome, numUtilizador, tipo, alunoSN);

		return utilizador;
	}
	
	public Utilizador criarUtilizadorExterno(String nome, int numUtilizador,  double numCC) {
		Utilizador utilizador = null;

		utilizador = new Externo(nome, numUtilizador, numCC);
		
		return utilizador;
	}
}
