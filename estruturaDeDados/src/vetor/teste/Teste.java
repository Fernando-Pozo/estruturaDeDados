package vetor.teste;

import contato.contato;
import vetor.vetor;

public class Teste {

	
	public static void main(String[] args) throws Exception {
	
		vetor<contato> vetor = new vetor<contato>(3); 
		
			contato c1 = new contato("Contato 1", "1234-4567", "contato1@emial.com");
			contato c2 = new contato("Contato 2", "1234-4567", "contato2@emial.com");
			contato c3 = new contato("Contato 3", "1234-4567", "contato3@emial.com");
		
			vetor.adiciona(c1);
			vetor.adiciona(c2);
			vetor.adiciona(c3);
			
		System.out.println(vetor);
	
	}
}
