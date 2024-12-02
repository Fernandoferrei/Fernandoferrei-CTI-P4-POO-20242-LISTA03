package br.edu.uteis;

public class Util {
	public static void transformacao(double seg) {
		double h, m, s, r;
		h = seg/3600;
		r = seg%3600;
		m = r/60;
		s = r%60;
		System.out.print("\nhora(s): "+h+"\n");
		System.out.print("minuto(s): "+m+"\n");
		System.out.print("segundo(s): "+s);
	}
}
