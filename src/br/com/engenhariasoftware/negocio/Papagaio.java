package br.com.engenhariasoftware.negocio;

public class Papagaio extends Animal implements Passaro {

	public Papagaio(String nome, int idade, double tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	public void caminha() {
		System.out.println("O " + nome + " est� caminhando.");
		
	}

	public void domi() {
		System.out.println("O " + nome + " est� dormindo");
		
	}

	public void come() {
		System.out.println("O " + nome + " come.");
		
	}

	public void especie() {
		System.out.println("O " + nome + " � da esp�cie Psittacidae.");
		
	}

	public void voar() {
		System.out.println("O " + nome + " voar");
		
	}

}
