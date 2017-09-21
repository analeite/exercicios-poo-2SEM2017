package br.com.fatec.telefone;

import java.util.Scanner;

import br.com.fatec.telefone.*;

import javax.swing.JOptionPane;

public class TelefoneDescriptografado {

	public static void main(String[] args) {

		int[] vetorD = new int[4];

		int d1, d2, d3, telD;

		telD = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite o número (com 4 digitos) a ser descriptografado ou -1 para sair do programa."));

		while (telD != -1) {
			if (telD > 10000) {
				telD = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Número inválido! Digite número usando apenas 4 digitos."));
			} else {

				int nInic = telD;
				// 2
				int milharD = nInic / 1000;
				d1 = nInic % 1000;
				System.out.println("Milhar = " + milharD);

				// 3
				int centenaD = d1 / 100;
				d2 = d1 % 100;
				System.out.println("Centena = " + centenaD);

				// 0
				int dezenaD = d2 / 10;
				d3 = d2 % 10;
				System.out.println("Dezena = " + dezenaD);

				// 1
				int unidadeD = d3;
				System.out.println("Unidade = " + unidadeD);

				vetorD[0] = ((milharD + 10) - 7) % 10;
				vetorD[1] = ((centenaD + 10) - 7) % 10;
				vetorD[2] = ((dezenaD + 10) - 7) % 10;
				vetorD[3] = ((unidadeD + 10) - 7) % 10;

				int a1 = vetorD[0];
				int a2 = vetorD[1];
				int a3 = vetorD[2];
				int a4 = vetorD[3];

				vetorD[0] = a3;
				vetorD[1] = a4;
				vetorD[2] = a1;
				vetorD[3] = a2;

				String nFim = vetorD[0] + "" + vetorD[1] + "" + vetorD[2] + "" + vetorD[3];
				JOptionPane.showMessageDialog(null, "O número descriptografado é: " + nFim);

				System.exit(0);
			}
		}

	}

}
