package br.com.fatec.maiormenor;
import java.util.Scanner;

public class Maiormenor {

	public static void main(String[] args) {
		
		//Atividade de Laborat�rio II, exerc�cio 3
		
		Scanner sc = new Scanner(System.in);
		
		int maior = 0;
		int menor = 0;
		
		int vetor[] = new int[5];
		
		for(int i = 0; i < 5; i++){
			System.out.println("Digite um n�mero: ");
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
		
		System.out.println("N�mero maior: " + maior);
		System.out.println("N�mero menor: " + menor);
		
		
		/*System.out.println("Digite o primeiro n�mero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int n2 = sc.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		int n3 = sc.nextInt();
		System.out.println("Digite o quarto n�mero: ");
		int n4 = sc.nextInt();
		System.out.println("Digite o quinto n�mero: ");
		int n5 = sc.nextInt();*/
		
		//int vetor[] = new int[5];
		
		for(int i = 0; i < 5; i++){
			
		}

	}

}
