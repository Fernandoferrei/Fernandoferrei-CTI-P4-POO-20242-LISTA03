package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[5];
        int[] y = new int[5];
        int[] r = new int[10];
        
        int i, j, aux;
        
        for (i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número para o vetor X: ");
            x[i] = sc.nextInt();
        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                if (x[j] > x[j + 1]) {
                    aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                }
            }
        }

        for (i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número para o vetor Y: ");
            y[i] = sc.nextInt();
        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                if (y[j] > y[j + 1]) {
                    aux = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = aux;
                }
            }
        }

        int k = 0;
        for (i = 0; i < 5; i++) {
            r[k++] = x[i];
            r[k++] = y[i];
        }

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 9; j++) {
                if (r[j] > r[j + 1]) {
                    aux = r[j];
                    r[j] = r[j + 1];
                    r[j + 1] = aux;
                }
            }
        }

        System.out.print("Vetor X ordenado: ");
        for (i = 0; i < 5; i++) {
            System.out.print(x[i] + " ");
        }

        System.out.print("\nVetor Y ordenado: ");
        for (i = 0; i < 5; i++) {
            System.out.print(y[i] + " ");
        }

        System.out.print("\nVetor R ordenado: ");
        for (i = 0; i < 10; i++) {
            System.out.print(r[i] + " ");
        }
    }
}
