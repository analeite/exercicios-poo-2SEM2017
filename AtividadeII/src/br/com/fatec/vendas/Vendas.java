package br.com.fatec.vendas;

import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {

		//Atividade de Laboratório II, exercício 6
		
		Scanner sc = new Scanner(System.in);
		float total = 0;
		float nro = 0;
		float result;
		
		System.out.println("Digite o nome completo do(a) vendedor(a): ");
		String nome = sc.nextLine();

		while (nro != -1) {
			System.out.println("Digite um item ou -1 para sair: ");
			float item = sc.nextFloat();
			nro = item;

			if (item != -1) {
				total = total + item;
			}

		}
		
		result = (total / 100) * 9;
		result = result + 200;
		
		System.out.printf("O(a) vendedor(a) %s recebeu %.2f pelo"
				+ " rendimento que teve na semana que se passou.", nome, result);


		System.exit(0);

	}

}
