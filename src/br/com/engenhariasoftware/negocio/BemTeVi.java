package br.com.engenhariasoftware.negocio;

public class BemTeVi extends Animal implements Passaro {

	public BemTeVi(String nome, int idade, double tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	public void caminha() {
		System.out.println("O Bem-ti-vi, gosta de caminhar na terra seca.");
		
	}

	public void domi() {
		System.out.println("O Bem-ti-vi, gostar de dormir em galhos");
		
	}

	public void come() {
		System.out.println("A alimentação do bem-ti-vi é bastante variada, pode comer centenas de insetos em apenas um dia");
		
	}

	public void especie() {
		System.out.println("O " + nome + " é da espécie dos tiranídeos.");
		
	}

}
