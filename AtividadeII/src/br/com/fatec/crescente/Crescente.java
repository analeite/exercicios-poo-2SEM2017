package br.com.fatec.crescente;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int n2 = sc.nextInt();
		
		
		int soma = n1 + n2;
		int media = (n1 + n2) / 2;
		
		if (n1 > n2){
			System.out.println("Resultado da soma: " + soma);
			System.out.println("M�dia: " + media);
			System.out.printf("O n�mero "+n1+" � maior do que " +n2);
		}
		else if (n2 > n1){
			System.out.println("Resultado da soma: " + soma);
			System.out.println("M�dia: " + media);
			System.out.printf("O n�mero "+n2+" � maior do que " +n1);
		}
		
		else if (n2 == n1){
			System.out.println("Resultado da soma: " + soma);
			System.out.println("M�dia: " + media);
			System.out.printf("O n�mero "+n2+" � igual a" +n1);
		}
		

	}

}
