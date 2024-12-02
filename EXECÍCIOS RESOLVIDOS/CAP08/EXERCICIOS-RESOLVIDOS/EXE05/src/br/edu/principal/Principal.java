package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.Util;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precoantigo, precoatual, acrescimo;
		System.out.print("preço antigo: ");
		precoantigo = sc.nextDouble();
		System.out.print("preço atual: ");
		precoatual = sc.nextDouble();
		acrescimo = Util.calculo_reajuste(precoantigo, precoatual);
		System.out.print("\nacresimo: "+acrescimo+" %");
		sc.close();

	}

}
