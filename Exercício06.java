package aulajava03;

import java.util.Scanner;

public class Exerc�cio06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero, soma = 0, i = 0;
		double media;

		System.out.println("Insira um n�mero. Digite 0 para finalizar.");

		do {
			System.out.println("Digite um n�mero: ");
			numero = entrada.nextInt();

			if (numero % 3 == 0) {
				soma += numero;
				i++;
			}

		} while (numero != 0);
		entrada.close();

		media = soma / i;

		System.out.println("A m�dia dos n�meros que s�o m�ltiplos de 3 �: " + media);

	}
}
