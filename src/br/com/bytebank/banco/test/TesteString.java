package br.com.bytebank.banco.test;

public class TesteString {
	public static void main(String[] args) {
		
		
		String nome ="      Alura         ";
		
		String vazio = "    Alura           ";
		String outroVazio = vazio.trim();
		System.out.println(vazio.contains("Alu"));
		
		System.out.println(outroVazio);
		
		
		//System.out.println(vazio.isEmpty());
		//String outro = nome.replace("A", "a");
		//String outro = nome.toLowerCase();
		
//		char c = nome.charAt(3);
//		System.out.println(c);
//		
//		int pos = nome.indexOf("ura");
//		System.out.println(pos);
//
//		String sub = nome.substring(1);
//		System.out.println(sub);
//		
//		System.out.println(nome);
		//System.out.println(outro);
		
//		for(int i = 0; i<nome.length();i++) {
//			System.out.println(nome.charAt(i));
//		}
	}
	
}
