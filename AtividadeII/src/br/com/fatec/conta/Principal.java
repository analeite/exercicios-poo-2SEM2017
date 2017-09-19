package br.com.fatec.conta;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Atividade de Laborat�rio II, exerc�cio 5
		
		float contaUser;
		float saldoIniMes;
		float totalDespesas;
		float creditosAplicados;
		float limiteAutorizado;
		
		
		contaUser = Float.parseFloat(JOptionPane.showInputDialog(
				null, "Digite o n�mero da conta: "
				));
		
		saldoIniMes = Float.parseFloat(JOptionPane.showInputDialog(
				null, "Digite o saldo no in�cio do m�s: "
				));
		
		totalDespesas = Float.parseFloat(JOptionPane.showInputDialog(
				null, "Digite o total de todos os itens cobrados no m�s: "
				));
		
		creditosAplicados = Float.parseFloat(JOptionPane.showInputDialog(
				null, "Digite o total de cr�ditos aplicados no m�s: "
				));
		limiteAutorizado = Float.parseFloat(JOptionPane.showInputDialog(
				null, "Digite o limite autorizado: "
				));
		
		ContaC contaC = new ContaC();
		
		contaC.setNroConta(contaUser);
		contaC.setSaldoInicio(saldoIniMes);
		contaC.setTotalItens(totalDespesas);
		contaC.setTotalCreditos(creditosAplicados);
		contaC.setLimiteCredito(limiteAutorizado);
		
		float saldoFinal = contaC.novoSaldo(saldoIniMes, totalDespesas, creditosAplicados);
		contaC.excedeLimite(saldoFinal, limiteAutorizado);
		
		JOptionPane.showMessageDialog(null, contaC.excedeLimite(saldoFinal, limiteAutorizado));
		
		
	}

}
