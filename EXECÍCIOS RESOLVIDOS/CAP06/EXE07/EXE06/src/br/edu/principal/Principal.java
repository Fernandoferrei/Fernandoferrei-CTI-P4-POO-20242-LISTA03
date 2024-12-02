package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vet = new int[10];
		int i, j, aux;
		for(i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"º número: ");
			vet[i] = sc.nextInt();
		}
		for(i=0; i<10; i++) {
			for(j=0; j< 9 - i; j++) {
				if(vet[j] < vet[j+1]) {
					aux = vet[j];
					vet[j]= vet[j+1];
					vet[j+1]= aux;
				}
			}
		}
		System.out.println("vetor em ordem decrescente:");
		for(i=0; i<10; i++) {
			System.out.println((i+1)+"º: " +vet[i]+" ");	
		}
	}

}
