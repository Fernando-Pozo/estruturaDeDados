package vetor.teste;

import vetor.vetor;

public class Teste {

	
	public static void main(String[] args) throws Exception {
	
		vetor vetor = new vetor(3);
		
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
			vetor.adiciona("elemento 4");
		
			vetor.remove(5);
		System.out.println(vetor);
	
	}
}
