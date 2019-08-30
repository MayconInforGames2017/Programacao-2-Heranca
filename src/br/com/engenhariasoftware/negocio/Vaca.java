package br.com.engenhariasoftware.negocio;

public class Vaca extends Mamifero implements Reino {

	public Vaca(String nome, int idade, double tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	@Override
	public void caminha() {
		System.out.println("A vaca caminha sobre o pasto");
	}

	@Override
	public void especie() {
		System.out.println("O nome vaca � atribu�do �s f�meas dos mam�feros da esp�cie Bos taurus." 
				+ "Touro � o nome dado ao macho reprodutivo; boi," 
				+ "ao macho castrado; novilho, ao gado jovem; e bezerro, ao filhote. ");
	}

	@Override
	public void domi() {
		System.out.println("O " + nome + " passa 8 horas ruminando e 8 horas dormindo.");
		
	}

	@Override
	public void come() {
		System.out.println("O " + nome + " passa 8 horas por dia comendo");
		
	}

	@Override
	public void vertebrados() {
		System.out.println("Todas as vacas s�o vertebradas.");
		
	}

}
