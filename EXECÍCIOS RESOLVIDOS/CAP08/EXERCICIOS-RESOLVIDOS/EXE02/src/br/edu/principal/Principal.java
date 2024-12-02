package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.Util;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, s;
		
		System.out.print("number 1: ");
		num1 = sc.nextDouble();
		System.out.print("number 2: ");
		num2 = sc.nextDouble();
		
		s = Util.somar(num1, num2);
		System.out.print("soma: "+s);
		sc.close();

	}

}
