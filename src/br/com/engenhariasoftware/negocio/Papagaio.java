package br.com.engenhariasoftware.negocio;

public class Papagaio extends Animal implements Passaro {

	public Papagaio(String nome, int idade, double tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	public void caminha() {
		System.out.println("O " + nome + " está caminhando.");
		
	}

	public void domi() {
		System.out.println("O " + nome + " está dormindo");
		
	}

	public void come() {
		System.out.println("O " + nome + " come.");
		
	}

	public void especie() {
		System.out.println("O " + nome + " é da espécie Psittacidae.");
		
	}

	public void voar() {
		System.out.println("O " + nome + " voar");
		
	}

}
