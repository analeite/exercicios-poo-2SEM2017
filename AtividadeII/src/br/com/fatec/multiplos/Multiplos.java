package br.com.fatec.multiplos;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		//Atividade de Laborat�rio II, exerc�cio 4
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int n2 = sc.nextInt();
		
		int n3;
		
		if(n1 % n2 == 0){
			System.out.println("O n�mero " + n1 + " � multiplo de " + n2);
		}
		else{
			System.out.println("O n�mero " + n1 + " n�o � multiplo de " + n2);

		}
	}
}
		