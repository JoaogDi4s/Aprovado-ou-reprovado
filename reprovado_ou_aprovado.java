package exercicios_if_else;

import java.util.Scanner;

public class reprovado_ou_aprovado {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		//
		System.out.println("Insira a média do aluno: ");
		int n1 = scan.nextInt();
					
		if (n1<=6) {
			System.out.println("\nVocê está reprovado!!!");
			}
		else 
			System.out.println("\nVocê está aprovado!!!");
			
				
	scan.close();
	
	}
}
