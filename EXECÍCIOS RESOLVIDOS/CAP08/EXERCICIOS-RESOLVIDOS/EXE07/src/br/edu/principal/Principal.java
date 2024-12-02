package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.Util;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, m;
		char letra=' ';
		System.out.print("nota 1: ");
		nota1 = sc.nextDouble();
		System.out.print("nota 2: ");
		nota2 = sc.nextDouble();
		System.out.print("nota 3: ");
		nota3 = sc.nextDouble();
		do {
			System.out.print("letra: ");
			letra = sc.next().charAt(0);
		} while (letra != 'A'& letra != 'P');
		m = Util.calcula_media(nota1, nota2, nota3, letra);
		if (letra == 'A') {
			System.out.println("Média aritimética: "+m);
		}
		else {
			System.out.println("Média ponderada: "+m);
		}
		sc.close();
	}

}
