package br.edu.univas;

import java.util.Scanner;

public class Q1 {
    
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float[] notas = new float[25];
       	
		lerNotas(notas);
		
		
	 System.out.print("Dentre as 25 notas, a maior nota foi "+maiorNota(notas)+" e a menor nota foi "+ menorNota(notas));
  
	 
	   ler.close();
	}

	public static void lerNotas(float notas[]) {
		
		for (int i = 0;i < 25; i++) {
			  int j = i + 1;
			
			System.out.println("Por favor, digite a nota do "+j+"º aluno:");
			notas[i] = ler.nextFloat();
			
			
			
		}
				
	}
	 
	public static float maiorNota(float notas[]) {
		
		float maior = 0.0f;
		
		for(int i = 0; i < 25;i++) {
				
		   if (notas[i] > maior) {
				
				maior = notas[i];		
			}		
		}
		
		
		return maior;
	}
	
    public static float menorNota(float notas[]) {
		
		float menor = 0.0f;
		
		for(int i = 0; i < 25;i++) {
		
			if (i == 0) {
				
				menor = notas[i];
				
			} else if (notas[i] < menor) {
				
				menor = notas[i];		
			}		
		}

		return menor;
	}
}
