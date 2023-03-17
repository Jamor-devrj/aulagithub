package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSoma {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		double soma = 0.0;
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
			soma += vet[i];
		}			
		
		System.out.printf("\nSOMA TOTAL = %.2f%n", soma);
					
		sc.close();
	}
}
