package br.com.fatec.revisao;

public class Questao9 {

	public static void main(String[] args) {
		int i, soma = 0;
		for (i = 1; i <= 5; i++) {
			if (i == 4)
				continue;
			soma += i;
		}
		System.out.println(soma);
	}

}
