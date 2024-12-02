package br.edu.principal;
import java.util.Scanner;
public class Principal { 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int [] vet1 = new int[3];
		int [] vet2 = new int[3];
		int [] vet3 = new int[6];
		
		int j = 0;
			
		for (int i = 0; i < 3; i++) {
			System.out.println("Preencha o vertor 01: ");
			vet1[i] = sc.nextInt();
			vet3[j] = vet1[i];
			j += 1;
			System.out.println("Preencha o vertor 02: ");	
			vet2[i] =sc.nextInt();
			vet3[j] = vet2[i];
			j += 1;
			
		}
		for(int i = 0; i < 6; i++) {
			System.out.println(vet3[i]);			
		}

	}

}
