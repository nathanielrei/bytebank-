package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class Teste {
	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Conta cc2= new ContaCorrente(22,22);
		guardador.adiciona(cc2);
		
		Conta naruto = new ContaPoupanca(10, 3);
		guardador.adiciona(naruto);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());
	}
}
