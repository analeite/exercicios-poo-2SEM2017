package br.com.fatec.vendasf;

public class Vetor {

	int vetor[] = new int[100];

	private int totalInformacoes = 0;

	public void adiciona(int vetor) {
		this.vetor[this.totalInformacoes] = vetor;
		this.totalInformacoes++;

	}

	public void adiciona(int posicao, Vetor vetor) {

	}

	// public Vetor pega (int posicao){
	// return this.vetor[posicao];
	//
	// }

	private boolean posicaoOcupada(int posicao) {
		return posicao < this.vetor.length && posicao >= 0;
	}

	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		for (int i = posicao; i < this.totalInformacoes - 1; i++){
			this.vetor[i] = this.vetor[i + 1];
		}
		this.totalInformacoes--;

	}

	// public Integer toInteger(){
	// return Arrays.toInteger(vetor);
	// }

}
