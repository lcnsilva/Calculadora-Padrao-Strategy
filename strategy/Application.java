package com.lcnsilva.strategy;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		double primeiroNumero = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Digite o segundo número: ");
		double segundoNumero = scanner.nextDouble();
		System.out.println("Digite o operador: ");
		System.out.println("+, -, / ou *");
		scanner.nextLine();
		String operador = scanner.nextLine();
		Contexto contexto = new Contexto();
		if(operador.equals("+")) {
			contexto.setOperacao(new Soma(primeiroNumero, segundoNumero));
		}else if(operador.equals("-")){
			contexto.setOperacao(new Subtracao(primeiroNumero, segundoNumero));
		}else if(operador.equals("/")){
			contexto.setOperacao(new Divisao(primeiroNumero, segundoNumero));
		}else if(operador.equals("*")){
			contexto.setOperacao(new Multiplicacao(primeiroNumero, segundoNumero));
		}else {
			System.out.println("Você não digitou um operador.");
		}
		System.out.println(contexto.executandoOperacao(primeiroNumero, segundoNumero));
		
	}

}
