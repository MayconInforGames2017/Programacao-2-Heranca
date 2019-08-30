package br.com.engenhariasoftware.negocio;

public abstract class Animal implements Reino {

	protected String nome;
	protected int idade;
	protected double tamanho;
	protected double peso;

	
	public Animal(String nome, int idade, double tamanho, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.tamanho = tamanho;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void voar() {
		
	}

	public abstract void caminha();

	public abstract void domi();
	
	public abstract void come();
	
}
