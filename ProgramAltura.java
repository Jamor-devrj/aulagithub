package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAltura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		double somaAltura = 0.0;
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
			somaAltura += altura[i]; 
		}		
				
		double alturaMedia = somaAltura / n;
		
		System.out.printf("\nAltura m�dia: %.2f%n", alturaMedia);
		
		int soma = 0;
		for(int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				soma = soma + 1;
			}
		}
		double menorIdade = (double) soma / n * 100;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", menorIdade) +"%" );
		
		for(int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
