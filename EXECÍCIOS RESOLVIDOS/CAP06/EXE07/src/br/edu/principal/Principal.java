package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8]; 
        int i, j, z, aux;
        i = 0; 
        while (i < 8) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            aux = sc.nextInt();  
            j = i - 1;  
            while (j >= 0 && vet[j] > aux) {
                j--;
            }
            z = i;
            while (z > j + 1) {
                vet[z] = vet[z - 1];
                z--;
            }  
            vet[j + 1] = aux;
            i++;  
        }
        System.out.println("Vetor ordenado de forma crescente:");
        for (i = 0; i < 8; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}


