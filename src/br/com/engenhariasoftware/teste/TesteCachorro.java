package br.com.engenhariasoftware.teste;

import br.com.engenhariasoftware.negocio.Cachorro;

public class TesteCachorro {
	
	public TesteCachorro() {
		Cachorro c1 = new Cachorro("Pastor alemão", 10, 59, 43);
		c1.caminha();
		c1.come();
		c1.domi();
		c1.vertebrados();
		c1.especie();
		
		Cachorro c2 = new Cachorro("Rottweiler", 4, 61, 45);
		c2.caminha();
		c2.come();
		c2.domi();
		c2.vertebrados();
		c2.especie();
	}

}
