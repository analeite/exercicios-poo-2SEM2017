package br.com.fatec.horastrabalhadas;

import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main(String[] args) {

		//Atividade de Laboratório II, exercício 7
		
		Scanner sc = new Scanner(System.in);

		float result = 0;
		int extra = 0;

		System.out.println("Digite o valor da hora trabalhada: ");
		float valorHora = sc.nextFloat();

		System.out.println("Digite a quantidade de horas trabalhadas: ");
		int quantHoras = sc.nextInt();

		if (quantHoras <= 40) {
			result = valorHora * quantHoras;
			System.out.printf("O salário recebido foi: R$%.2f", result);
		} else {
			extra = quantHoras - 40;
			extra = (extra / 100) * 50;
			result = (valorHora * quantHoras) + extra;
			System.out.printf("O salário recebido foi: R$%.2f", result);
		}
		
		System.exit(0);

	}

}
