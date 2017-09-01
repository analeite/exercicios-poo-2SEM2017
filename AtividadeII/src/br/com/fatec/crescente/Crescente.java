package br.com.fatec.crescente;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = sc.nextInt();
		
		
		int soma = n1 + n2;
		int media = (n1 + n2) / 2;
		
		if (n1 > n2){
			System.out.println("Resultado da soma: " + soma);
			System.out.println("Média: " + media);
			System.out.printf("O número "+n1+" é maior do que " +n2);
		}
		else if (n2 > n1){
			System.out.println("Resultado da soma: " + soma);
			System.out.println("Média: " + media);
			System.out.printf("O número "+n2+" é maior do que " +n1);
		}
		
		else if (n2 == n1){
			System.out.println("Resultado da soma: " + soma);
			System.out.println("Média: " + media);
			System.out.printf("O número "+n2+" é igual a" +n1);
		}
		

	}

}
