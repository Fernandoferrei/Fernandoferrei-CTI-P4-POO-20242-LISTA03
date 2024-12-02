package br.edu.uteis;

import java.util.Scanner;

public class Util {
	public static void maior_menor() {
		Scanner sc = new Scanner(System.in);
		double num, maior=0, menor=0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Número "+i+": ");
			num = sc.nextDouble();	
			if (i == 1) {
				maior = num;
				menor = num;
			}
			else {
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
			}
		}
		System.out.print("\nMaior número: "+maior);
		System.out.print("\nMenor número: "+menor);
		sc.close();
	}
}
