package aulajava03;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int idade;
		int genero;
		int pessoascalmas = 0, mulheresnervosas = 0, homensagressivos = 0, outroscalmos = 0;
		int pessoasnervosas = 0, pessoascalmasmenoridade = 0;
		int temperamento;
		int i = 0;

		while (i < 5) {

			System.out.println("Qual � a sua idade? ");
			idade = entrada.nextInt();

			System.out.println("Qual � o seu g�nero? Digite 1 para feminino, 2 para masculino e 3 para outros.");
			genero = entrada.nextInt();

			System.out.println("Qual � o seu temperamento? Digite 1 para calmo, 2 para nervoso, 3 para agressivo.");
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

			System.out.println("O n�mero de pessoas calmas �: " + pessoascalmas);
			System.out.println("O n�mero de mulheres nervosas �: " + mulheresnervosas);
			System.out.println("O n�mero de homens agressivos �: " + homensagressivos++);
			System.out.println(
					"O n�mero de pessoas calmas que n�o s�o do g�nero feminino e masculino �: " + outroscalmos);
			System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: " + pessoasnervosas);
			System.out.println("O n�mero de pessoas nervosas com menos de 18 anos �: " + pessoascalmasmenoridade);

			entrada.close();
		}
	}
}
