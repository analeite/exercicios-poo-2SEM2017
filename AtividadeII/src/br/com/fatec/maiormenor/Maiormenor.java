package br.com.fatec.maiormenor;
import java.util.Scanner;

public class Maiormenor {

	public static void main(String[] args) {
		
		//Atividade de Laboratório II, exercício 3
		
		Scanner sc = new Scanner(System.in);
		
		int maior = 0;
		int menor = 0;
		
		int vetor[] = new int[5];
		
		for(int i = 0; i < 5; i++){
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		maior = vetor[0];
		menor = vetor[0];
		
		for(int i = 0; i < 5; i++){
			if(maior < vetor[i]){
				maior = vetor[i];
			}
			else if (menor > vetor[i]){
				menor = vetor[i];
			}
		}
		
		System.out.println("Número maior: " + maior);
		System.out.println("Número menor: " + menor);
		
		
		/*System.out.println("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		int n3 = sc.nextInt();
		System.out.println("Digite o quarto número: ");
		int n4 = sc.nextInt();
		System.out.println("Digite o quinto número: ");
		int n5 = sc.nextInt();*/
		
		//int vetor[] = new int[5];
		
		for(int i = 0; i < 5; i++){
			
		}

	}

}
