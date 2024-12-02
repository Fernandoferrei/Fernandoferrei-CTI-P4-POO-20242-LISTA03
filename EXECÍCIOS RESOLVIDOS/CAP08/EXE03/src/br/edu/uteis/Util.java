package br.edu.uteis;

public class Util {
	public static double divisores(double a, double b, double c) {
		double i, s, r;
		s = 0;
		for (i=b;i<=c;i++) {
			r = i%a;
			if (r==0) {
				s = s + i;
			}
		}
		return s;
	}
}
