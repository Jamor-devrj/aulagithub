package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSomaVetor {

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
		}
		
		System.out.print("\nVALORES = ");
		for (int i = 0; i < vet.length; i++) {
			System.out.printf("%.1f  ", vet[i]);
			soma += vet[i];
		}
		
		double media = soma / vet.length;
		
		System.out.printf("\nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);		
		
		sc.close();
	}
}
