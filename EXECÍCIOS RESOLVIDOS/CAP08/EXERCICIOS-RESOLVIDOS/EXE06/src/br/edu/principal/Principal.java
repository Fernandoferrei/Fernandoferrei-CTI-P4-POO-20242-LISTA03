package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.Util;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("número: ");
			num = sc.nextInt();
		} while (num < 1 | num > 9);
		
		Util.multiplicacao(num);
		sc.close();
	}

}
