package br.com.fatec.maiormenor;
import java.util.Scanner;

public class Maiormenor {

	public static void main(String[] args) {
		
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
		
		for(int i = 0; i < 5; i++){
			
		}

	}

}
