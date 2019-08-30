package br.com.engenhariasoftware.teste;

import br.com.engenhariasoftware.negocio.BemTeVi;

public class TesteBemTeVi {
	
	public TesteBemTeVi() {
		BemTeVi b1 = new BemTeVi("Bem te vi", 2, 40, 170);
		b1.caminha();
		b1.come();
		b1.domi();
		b1.especie();
		b1.voar();
	}

}
