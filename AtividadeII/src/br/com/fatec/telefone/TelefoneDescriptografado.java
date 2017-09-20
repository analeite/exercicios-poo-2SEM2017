package br.com.fatec.telefone;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TelefoneDescriptografado {

	public static void main(String[] args) {
		
		int[] vetorD = new int[4];
		
		int d1, d2, d3, telD;
		
		telD = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite "
				+ "o número de telefone (4 digitos) a ser descriptografado ou"
				+ " -1 para sair do programa."));
		
		while(telD != -1){
			
				int nInic = telD;
				
				int milharD = nInic / 1000;
				d1 = nInic % 1000;
				System.out.println("Milhar = " + milharD);
				
				int centenaD = d1 / 100;
				d2 = d1 % 100;
				System.out.println("Centena = " + centenaD);

				
				int dezenaD = d2 / 10;
				d3 = d2 % 10;
				System.out.println("Dezena = " + dezenaD);

				
				int unidadeD = d3;
				System.out.println("Unidade = " + unidadeD);
				
				
				//vetorD [0] = ();

				System.exit(0);
				
			}
			
			
		}
		
		
//		vetor[0] = (milhar + 7) % 10;
//		System.out.println("\n\nVetor[0] = " + vetor[0]);
//
//		vetor[1] = (centena + 7) % 10;
//		System.out.println("Vetor[1] = " + vetor[1]);
//
//		vetor[2] = (dezena + 7) % 10;
//		System.out.println("Vetor[2] = " + vetor[2]);
//
//		vetor[3] = (unidade + 7) % 10;
//		System.out.println("Vetor[3] = " + vetor[3]);

	}


