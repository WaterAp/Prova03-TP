package br.edu.univas;

import java.util.Scanner;

public class Q2 {
    
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int all = 50;
		String[] nomes = new String[all];
		
		register(nomes, all);
		
	    System.out.println("Todos os nomes foram registrados!!!");
		
        ler.close();
	}

	public static void register(String nomes[], int all) {
		
		String auxNome;
	
	for (int i = 0; i < all;) {
		System.out.println("Por favor, digite um nome que deseja adicionar a lista de convidados: ");
		auxNome = ler.nextLine();
		
		for(int j =0;j < all;) {
			
			if (auxNome.equals(nomes[j])) {
				
				System.out.println("Este nome ja foi adicionado a lista tente outro!!! ");
				break;
			
			} else {
				
				nomes[j] = auxNome;
				i++;
				break;
			}	
		 }      
	   }		
	}
}

/*
 * System.out.println(" ");
 * 
 * */

