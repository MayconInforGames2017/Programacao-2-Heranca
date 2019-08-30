package br.com.engenhariasoftware.teste;

import br.com.engenhariasoftware.negocio.Papagaio;

public class TestePapagaio {
	// teste3
	public TestePapagaio() {
		Papagaio p1 = new Papagaio("Amazona", 2, 23, 240);
		p1.caminha();
		p1.come();
		p1.domi();
		p1.especie();
		p1.voar();
	}

}
