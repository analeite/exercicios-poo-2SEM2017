package br.com.fatec.vendasf;

import java.util.ArrayList;
import java.util.Scanner;
import br.com.fatec.vendasf.Vetor;


public class Vendasf {

	public static void main(String[] args) {

		//ArrayList array = new ArrayList();
		
		int vetor[] = new int[100];
		
		int saldoNovo;

		Vetor saldo = new Vetor();
		Vetor itens = new Vetor();
		Vetor creditos = new Vetor();
		Vetor limite = new Vetor();
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o n�mero da conta do cliente ou -1 para sair: ");
		int conta = sc.nextInt();
		
		while(conta != -1){
			System.out.println("Digite o saldo inicial do m�s: ");
			vetor[0] = sc.nextInt();
			System.out.println("Digite o total de todos os itens "
					+ "cobrados do cliente no m�s: ");
			int i = sc.nextInt();
			System.out.println("Digite o total de cr�ditos aplicados"
					+ " ao cliente no m�s: ");
			int c = sc.nextInt();
			System.out.println("Digite o limite de credito autorizado: ");
			int l = sc.ne
			
			
		}
		
		

	}

}
