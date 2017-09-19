package br.com.fatec.conta;

public class ContaC {
	
	//Atividade de Laboratório II, exercício 5
	
	private float nroConta;
	private float saldoInicio;
	private float totalItens;
	private float totalCreditos;
	private float limiteCredito;

	//Método construtor. O set faz a mesma coisa que esse método
//	public ContaC(int nroConta, int saldoInicio, int totalItens, int totalCreditos, int limiteCredito) {
//		this.nroConta = nroConta;
//		this.saldoInicio = saldoInicio;
//		this.totalItens = totalItens;
//		this.totalCreditos = totalCreditos;
//		this.limiteCredito = limiteCredito;
//
//	}

	public float getNroConta() {
		return nroConta;
	}

	public float getSaldoInicio() {
		return saldoInicio;
	}

	public float getTotalItens() {
		return totalItens;
	}

	public float getTotalCreditos() {
		return totalCreditos;
	}

	public float getLimiteCredito() {
		return limiteCredito;
	}

	public void setNroConta(float nroConta) {
		this.nroConta = nroConta;
	}

	public void setSaldoInicio(float saldoInicio) {
		this.saldoInicio = saldoInicio;
	}

	public void setTotalItens(float totalItens) {
		this.totalItens = totalItens;
	}

	public void setTotalCreditos(float totalCreditos) {
		this.totalCreditos = totalCreditos;
	}

	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public float novoSaldo(float saldoInicio, float totalItens, float totalCreditos){
		return (saldoInicio + totalItens - totalCreditos);
	}
	
	public String excedeLimite(float novoSaldo, float limiteCredito){
		float calculo = limiteCredito - novoSaldo;
		String s;
		
		
		if(calculo < 0){
			calculo = calculo * -1;
			s = "Limite de crédito excedido em R$ " + String.format("%.2f", calculo);
		}
		else{
			s = "Limite de crédito não excedido!";
		}
		return s;
	}

}
