package vetor.teste;

import java.util.ArrayList;

import contato.contato;
import vetor.vetor;

public class Teste {

	
	public static void main(String[] args) throws Exception {
	
	
		vetor<String> vetor = new vetor<String>(3);

		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("A");
		vetor.adiciona("A");
		vetor.adiciona("A");
		vetor.adiciona("A");
		vetor.adiciona("C");
		
		System.out.println(vetor.ultimaposicao("A"));
		vetor.remove("C");
		System.out.println(vetor);
	}
}
