package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.Util;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora_i, min_i, hora_f, min_f, minutos;
		
		System.out.print("Hora inicial: ");
		hora_i = sc.nextInt();
		System.out.print("minuto inicial: ");
		min_i = sc.nextInt();
		
		System.out.print("Hora final: ");
		hora_f = sc.nextInt();
		System.out.print("minuto final: ");
		min_f = sc.nextInt();
		
		minutos = Util.calculo(hora_i, min_i, hora_f, min_f);
		System.out.print("\nminutos: "+minutos);
		sc.close();

	}

}
