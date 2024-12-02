package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.Util;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, x;
		
		System.out.print("number: ");
		num = sc.nextDouble();
		x = Util.verifica(num);
		
		if (x == 1){
			System.out.print("Número positivo");
		}
		else {
			System.out.print("Número negativo");
		}
		sc.close();
	}

}
