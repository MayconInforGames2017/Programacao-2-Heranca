package br.com.engenhariasoftware.teste;

import br.com.engenhariasoftware.negocio.Vaca;

public class TesteVaca {
	// teste4
	public TesteVaca() {
		Vaca v1 = new Vaca("Boi", 9, 2, 150);
		v1.caminha();
		v1.come();
		v1.domi();
		v1.especie();
		v1.vertebrados();
	}

}
