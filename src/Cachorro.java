
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
		System.out.println("É um mamifero carnívoro da familia dos canídeos, Subespécie do lobo." 
							+ "\n" + "Talvez o mais antigo animal domesticado pelo ser humano");
	}

	@Override
	public void domi() {
		System.out.println("Os cães dormem.");
		
	}

	@Override
	public void come() {
		System.out.println("São carnívoros");
		
	}

	@Override
	public void vertebrados() {
		System.out.println("");
		
	}

}
