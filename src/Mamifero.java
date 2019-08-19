
public abstract class Mamifero extends Animal implements Reino {

	private int patas;

	public abstract void vertebrados();

	public Mamifero(String nome, int idade, double tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	private int quantPatas() {
		if (patas == 4) {
			System.out.println("O " + nome + " É um animal quadrúpedes");
		} else {
			System.out.println("O " + nome + " É um animal bípede");
		}
		return patas;
	}

}
