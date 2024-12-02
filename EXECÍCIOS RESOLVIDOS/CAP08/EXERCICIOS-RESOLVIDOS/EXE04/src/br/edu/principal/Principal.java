package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.Util;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double seg;
		System.out.print("segundos: ");
		seg = sc.nextDouble();
		Util.transformacao(seg);		
		sc.close();
	}

}
