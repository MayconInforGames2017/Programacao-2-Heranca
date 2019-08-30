package br.com.engenhariasoftware.negocio;

public class Vaca extends Mamifero implements Reino {

	public Vaca(String nome, int idade, double tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	public void caminha() {
		System.out.println("A vaca caminha sobre o pasto");
	}

	public void especie() {
		System.out.println("O nome vaca é atribuído às fêmeas dos mamíferos da espécie Bos taurus." 
				+ "Touro é o nome dado ao macho reprodutivo; boi," 
				+ "ao macho castrado; novilho, ao gado jovem; e bezerro, ao filhote. ");
	}

	public void domi() {
		System.out.println("O " + nome + " passa 8 horas ruminando e 8 horas dormindo.");
		
	}

	public void come() {
		System.out.println("O " + nome + " passa 8 horas por dia comendo");
		
	}

	public void vertebrados() {
		System.out.println("Todas as vacas são vertebradas.");
		
	}

}
