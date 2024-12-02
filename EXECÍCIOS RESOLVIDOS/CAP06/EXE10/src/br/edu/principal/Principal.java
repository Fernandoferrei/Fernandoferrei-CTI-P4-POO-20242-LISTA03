package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, pt, tl_ap = 0, per_ap;
        String[] res = new String[8];
        String[] gab = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a resposta da questão " + (i+1) + ":");
            gab[i] = sc.nextLine();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número do " + (i+1) + "º aluno");
            n = sc.nextInt();
            sc.nextLine();
            pt = 0;
            
            for (int j = 0; j < 8; j++) {
                System.out.println("Digite a resposta dada pelo aluno " + n + " à " + (j+1) + "º questão");
                res[j] = sc.nextLine();
                
                if (res[j].equals(gab[j])) {
                    pt++;
                }
            }
            
            System.out.println("A nota do aluno " + n + " foi " + pt);
            
            if (pt >= 6) {
                tl_ap++;
            }
        }
        
        per_ap = tl_ap * 100 / 10;
        System.out.println("O percentual de alunos aprovados é " + per_ap + "%");
    }
}
