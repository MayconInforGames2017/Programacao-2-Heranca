package br.com.engenhariasoftware.negocio;

public class Cachorro extends Mamifero implements Reino {

	public Cachorro(String nome, int idade, double tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	@Override
	public void caminha() {
		System.out.println("O " + nome + " caminha.");
		
	}

	@Override
	public void especie() {
		System.out.println("� um mamifero carn�voro da familia dos can�deos, Subesp�cie do lobo." 
							+ "\n" + "Talvez o mais antigo animal domesticado pelo ser humano" + "\n");
	}

	@Override
	public void domi() {
		System.out.println("O " + nome + " dormem.");
		
	}

	@Override
	public void come() {
		System.out.println("O " + nome + " est� comendo ra��o");
		
	}

	@Override
	public void vertebrados() {
		System.out.println("Todos os c�es s�o vertebrados");
		
	}

}
