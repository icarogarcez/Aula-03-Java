package aulajava03;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {

		int numero;
		int par = 0;
		int impar = 0;

		for (int i = 1; i <= 10; i++) {
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite o " + i + "� n�mero: ");

			numero = entrada.nextInt();

			if (numero % 2 == 0) {
				par++;
			}
			if (numero % 2 == 1) {
				impar++;
			}
		}

		System.out.println("A quantidade de n�meros pares �: " + par);
		System.out.println("A quantidade de n�meros �mpares �: " + impar);

	}
}
