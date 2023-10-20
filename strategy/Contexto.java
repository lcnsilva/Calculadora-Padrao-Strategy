package com.lcnsilva.strategy;

public class Contexto {
	private Operacoes operacao;

	public void setOperacao(Operacoes operacao) {
		this.operacao = operacao;
	}
	
	public double executandoOperacao(double n1, double n2) {
		return operacao.operacao(n1, n2);
	}

	public Contexto() {
	}
	
	
}
