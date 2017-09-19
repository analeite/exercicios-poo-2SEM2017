package br.com.fatec.multiplos;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		//Atividade de Laboratório II, exercício 4
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = sc.nextInt();
		
		int n3;
		
		if(n1 % n2 == 0){
			System.out.println("O número " + n1 + " é multiplo de " + n2);
		}
		else{
			System.out.println("O número " + n1 + " não é multiplo de " + n2);

		}
	}
}
		