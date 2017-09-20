package br.com.fatec.telefone;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TelefoneCriptografado {

	public static void main(String[] args) {

		int[] vetor = new int[4];

		int n1, n2, n3, tel;

		tel = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite o número de telefone (4 digitos) ou -1 para sair do " + "programa."));
		
		while (tel != -1) {
			if (Integer.toString(tel).length() > 4 || Integer.toString(tel).length() == 3
					|| Integer.toString(tel).length() == 2 || Integer.toString(tel).length() == 1) {

				tel = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Número inválido! Digite o número de telefone " + "usando apenas 4 digitos."));
			} else {
				int nroInicial = tel;

				int milhar = nroInicial / 1000;
				n1 = nroInicial % 1000;
				System.out.println("milhar = " + milhar);

				int centena = n1 / 100;
				n2 = n1 % 100;
				System.out.println("centena = " + centena);

				int dezena = n2 / 10;
				n3 = n2 % 10;
				System.out.println("dezena = " + dezena);

				int unidade = n3;
				System.out.println("unidade = " + unidade);
				
				

				vetor[2] = (milhar + 7) % 10;
				System.out.println("\n\nVetor[2] = " + vetor[2]);

				vetor[3] = (centena + 7) % 10;
				System.out.println("Vetor[3] = " + vetor[3]);

				vetor[0] = (dezena + 7) % 10;
				System.out.println("Vetor[0] = " + vetor[0]);

				vetor[1] = (unidade + 7) % 10;
				System.out.println("Vetor[1] = " + vetor[1]);

				String nroFinal = vetor[0] + "" + vetor[1] + "" + vetor[2] + "" + vetor[3];
				JOptionPane.showMessageDialog(null, "O telefone criptografado" + " é: " + nroFinal);

				System.exit(0);

			}

		}
	}
}
