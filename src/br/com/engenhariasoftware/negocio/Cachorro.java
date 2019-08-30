package br.com.engenhariasoftware.negocio;

public class Cachorro extends Mamifero implements Reino {

	public Cachorro(String nome, int idade, double tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	public void caminha() {
		System.out.println("O " + nome + " caminha.");
		
	}

	public void especie() {
		System.out.println("É um mamifero carnívoro da familia dos canídeos, Subespécie do lobo." 
							+ "\n" + "Talvez o mais antigo animal domesticado pelo ser humano" + "\n");
	}

	public void domi() {
		System.out.println("O " + nome + " dormem.");
		
	}

	public void come() {
		System.out.println("O " + nome + " está comendo ração");
		
	}

	public void vertebrados() {
		System.out.println("Todos os cães são vertebrados");
		
	}

}
