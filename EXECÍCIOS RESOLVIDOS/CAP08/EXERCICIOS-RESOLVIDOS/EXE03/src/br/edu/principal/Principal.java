package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.Util;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, result;
		do {
			System.out.print("a: ");
			a = sc.nextDouble();
		} while (a > 1);
		
		System.out.print("b: ");
		b = sc.nextDouble();
		System.out.print("c: ");
		c = sc.nextDouble();
		
		result = Util.divisores(a, b, c);
		System.out.print("\nresult: "+result);
		sc.close();
	}

}
