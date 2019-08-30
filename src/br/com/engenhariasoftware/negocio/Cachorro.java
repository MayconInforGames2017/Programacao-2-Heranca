package br.com.engenhariasoftware.negocio;

public class Cachorro extends Mamifero implements Reino {

	public Cachorro(String nome, int idade, double tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	public void caminha() {
		System.out.println("O " + nome + " caminha.");
		
	}

	public void especie() {
		System.out.println("� um mamifero carn�voro da familia dos can�deos, Subesp�cie do lobo." 
							+ "\n" + "Talvez o mais antigo animal domesticado pelo ser humano" + "\n");
	}

	public void domi() {
		System.out.println("O " + nome + " dormem.");
		
	}

	public void come() {
		System.out.println("O " + nome + " est� comendo ra��o");
		
	}

	public void vertebrados() {
		System.out.println("Todos os c�es s�o vertebrados");
		
	}

}
