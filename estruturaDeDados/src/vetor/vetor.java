package vetor;

public class vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public vetor(int capacidade){
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	/*public void adiciona(String elemento) {
		for(int i=0; i<this.elementos.length;i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	public void adiciona(String elemento) throws Exception {
		aumentacapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}else {
			throw new Exception("Vetor já esta cheio");
		}
		
	}
	
	
	public Boolean adiciona(String elemento, int posicao) throws Exception {
		validacao(posicao);
		aumentacapacidade();
		for(int i = this.tamanho; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
			this.elementos[posicao] = elemento;
			this.tamanho++;
			return true;
	}
	
	public void remove(int posicao) {
		validacao(posicao);
		for(int i = posicao; i<this.tamanho-1;i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public void aumentacapacidade() {
		if(this.tamanho == this.elementos.length) {
			String[] novoselementos = new String[this.elementos.length * 2];
			for(int i=0; i < this.elementos.length; i++) {
				novoselementos[i] = this.elementos[i];
			}
			this.elementos = novoselementos;
		}
	}
	
	public String busca(int posicao) {
		validacao(posicao);
		return this.elementos[posicao];
	}
	
	//busca sequencial dentro de um vetor
	public int busca(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public void validacao(int posicao) {
		if(!(posicao >= 0 && posicao <= tamanho)) {
			throw new IllegalArgumentException("Numero Invalido");
		}
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
	
}
