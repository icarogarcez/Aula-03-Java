package aulajava03;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int idade;
		int genero;
		int pessoascalmas = 0, mulheresnervosas = 0, homensagressivos = 0, outroscalmos = 0;
		int pessoasnervosas = 0, pessoascalmasmenoridade = 0;
		int temperamento;
		int i = 0;

		while (i < 5) {

			System.out.println("Qual é a sua idade? ");
			idade = entrada.nextInt();

			System.out.println("Qual é o seu gênero? Digite 1 para feminino, 2 para masculino e 3 para outros.");
			genero = entrada.nextInt();

			System.out.println("Qual é o seu temperamento? Digite 1 para calmo, 2 para nervoso, 3 para agressivo.");
			temperamento = entrada.nextInt();

			if (temperamento == 1) {
				pessoascalmas++;
			}
			if (temperamento == 2 && genero == 1) {
				mulheresnervosas++;
			}
			if (genero == 2 && temperamento == 3) {
				homensagressivos++;
			}
			if (genero == 3 && temperamento == 1) {
				outroscalmos++;
			}
			if (idade > 40 && temperamento == 2) {
				pessoasnervosas++;
			}
			if (idade < 18 && temperamento == 1) {
				pessoascalmasmenoridade++;
			}
			i++;

			System.out.println("O número de pessoas calmas é: " + pessoascalmas);
			System.out.println("O número de mulheres nervosas é: " + mulheresnervosas);
			System.out.println("O número de homens agressivos é: " + homensagressivos++);
			System.out.println(
					"O número de pessoas calmas que não são do gênero feminino e masculino é: " + outroscalmos);
			System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + pessoasnervosas);
			System.out.println("O número de pessoas nervosas com menos de 18 anos é: " + pessoascalmasmenoridade);

			entrada.close();
		}
	}
}
