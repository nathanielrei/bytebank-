package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayList {
	
	public static void main(String[] args) {
		// Generics
		List<Conta> lista = new ArrayList<Conta>();
		ArrayList<String> nomes = new ArrayList<String>();
		 
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		 
		Conta cc2 = new ContaCorrente(22,22);
		lista.add(cc2);
		
		System.out.println("Tamanho: "+ lista.size());		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: "+ lista.size());
		
		Conta cc3 = new ContaCorrente(33,311);
		lista.add(cc3);
		
		Conta cc4= new ContaCorrente(33,322);
		lista.add(cc4);
		
		
		for(int i = 0; i< lista.size(); i++) {
			Conta oRef=lista.get(i);
			
			System.out.println(oRef);
		}
		System.out.println("-----------------------------");
		
		for(Conta Conta : lista) {
			System.out.println(Conta);
		}
		
		
		
	}
}
