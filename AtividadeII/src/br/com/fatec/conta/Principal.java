package br.com.fatec.conta;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Atividade de Laboratório II, exercício 5
		
		float contaUser;
		float saldoIniMes;
		float totalDespesas;
		float creditosAplicados;
		float limiteAutorizado;
		
		
		contaUser = Float.parseFloat(JOptionPane.showInputDialog(
				null, "Digite o número da conta: "
				));
		
		saldoIniMes = Float.parseFloat(JOptionPane.showInputDialog(
				null, "Digite o saldo no início do mês: "
				));
		
		totalDespesas = Float.parseFloat(JOptionPane.showInputDialog(
				null, "Digite o total de todos os itens cobrados no mês: "
				));
		
		creditosAplicados = Float.parseFloat(JOptionPane.showInputDialog(
				null, "Digite o total de créditos aplicados no mês: "
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
