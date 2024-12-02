package br.edu.uteis;

public class Util {
	public static double sequencia(double n) {
		double a, b, f, seq;
		seq = 1;
		for (a=1;a<=n;a++) {
			f = 1;
			for (b=1;b<=a;b++) {
				f = f * b;
			}
			seq = seq + 1 /f;
		}
		return seq;
	}
}