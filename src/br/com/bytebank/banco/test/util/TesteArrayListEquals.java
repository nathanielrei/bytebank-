package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
		// Generics
//		ArrayList<Conta> lista = new ArrayList<Conta>();
//		
//		 
//		Conta cc = new ContaCorrente(22, 11);
//		lista.add(cc);
//		 
//		Conta cc2 = new ContaCorrente(22,22);
//		lista.add(cc2);
//		
//		Conta cc3 = new ContaCorrente(33,311);
//		boolean existe = lista.contains(cc3); 
//		
//		System.out.println("Já tenha essa conta! " + existe);
//		
//		for(Conta Conta : lista) {
//			System.out.println(Conta);
//		}
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc);
		lista.add(cc2);
		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe= lista.contains(cc3);
		System.out.println("Já existe? " + existe );
		
		for(Conta conta : lista) {
			System.out.println(conta); 
		}
		
		
		
		
		
		
	}
}
