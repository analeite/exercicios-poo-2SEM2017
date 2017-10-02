package br.com.fatec.revisao;

public class Questao10 {

	public static void main(String[] args) {
		int i, soma = 0;
		for (i = 1; i <= 5; i++) {
			if (i == 4)
				break;
			soma += i;
		}
		System.out.println(soma);
	}

}
