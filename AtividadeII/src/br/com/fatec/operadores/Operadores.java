package br.com.fatec.operadores;
import java.util.Scanner;


public class Operadores {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int n2 = sc.nextInt();
		
		System.out.println("Digite 1 para adi��o, 2 para subtra��o, 3 pra multiplica��o, 4 para divis�o ou 5 para sair: ");
		int op = sc.nextInt();
		
		if(op == 1){
			int resul = n1 + n2;
			System.out.println("Resultado da soma: " + resul);
		}
		
		else if(op == 2){
			int resul = n1 - n2;
			System.out.println("Resultado da subtra��o: " + resul);
		}
		else if(op == 3){
			int resul = n1 * n2;
			System.out.println("Resultado da multiplica��o: " + resul);
		}
		else if(op == 4){
			int resul = n1 / n2;
			System.out.println("Resultado da divis�o: " + resul);
		}
		else
			System.exit(0);
		}
	}

