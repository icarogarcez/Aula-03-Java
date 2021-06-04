package aulajava03;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero, soma = 0, i = 0;
		double media;

		System.out.println("Insira um número. Digite 0 para finalizar.");

		do {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();

			if (numero % 3 == 0) {
				soma += numero;
				i++;
			}

		} while (numero != 0);
		entrada.close();

		media = soma / i;

		System.out.println("A média dos números que são múltiplos de 3 é: " + media);

	}
}
