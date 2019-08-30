package br.com.engenhariasoftware.negocio;

public class Papagaio extends Animal implements Passaro {

	public Papagaio(String nome, int idade, double tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	@Override
	public void caminha() {
		System.out.println("O " + nome + " está caminhando.");
		
	}

	@Override
	public void domi() {
		System.out.println("O " + nome + " está dormindo");
		
	}

	@Override
	public void come() {
		System.out.println("O " + nome + " come.");
		
	}

	@Override
	public void especie() {
		System.out.println("O " + nome + " é da espécie Psittacidae.");
		
	}

	@Override
	public void voar() {
		System.out.println("O " + nome + " voar");
		
	}

}
