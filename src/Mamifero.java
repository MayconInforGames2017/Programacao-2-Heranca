
public abstract class Mamifero extends Animal implements Reino {

	private int patas;

	public abstract void vertebrados();

	public Mamifero(String nome, int idade, double tamanho, double peso) {
		super(nome, idade, tamanho, peso);
	}

	private int quantPatas() {
		if (patas == 4) {
			System.out.println("O " + nome + " � um animal quadr�pedes");
		} else {
			System.out.println("O " + nome + " � um animal b�pede");
		}
		return patas;
	}

}
