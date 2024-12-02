package br.edu.uteis;

public class Util {
	public static double somar(double num1, double num2) {
		double i, s;
		s = 0;
		for (i=num1+1;i<=num2-1;i++) {
			s += i;
		}	
		return s;
	}

}
