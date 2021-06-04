package aulajava03;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {

		int menos21 = 0;
		int mais50 = 0;
		int idade = 0;

		Scanner entrada = new Scanner(System.in);
		while (idade != -99) {
			System.out.println("Qual é a sua idade?");
			idade = entrada.nextInt();

			if (idade == -99) {
				System.out.println("Você finalizou o programa.");

			}

			if (idade >= 0 && idade <= 21) {
				menos21++;
			} else if (idade > 50) {
				mais50++;
			}
		}
		System.out.println("A quantidade de pessoas com menos de 21 anos é: " + menos21 + ".");
		System.out.println("A quantidade de pessoas com mais de 50 anos é: " + mais50 + ".");

		entrada.close();
	}

}
