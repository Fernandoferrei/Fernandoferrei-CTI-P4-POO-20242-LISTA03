package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]  num = new int[9];
        int i, j, cont;
        
        for( i=1 ;i<9 ;i++) {
        	System.out.println("digite o valor do vetor " + (i+1) +": ");  
        	num[i] = sc.nextInt();
        }
        
        for(i = 1; i <9; i++) {
        	cont = 0;
        	
        	for(j = 1; j<=num[i]; j++ ) {       		
        		if((num[i]%j == 0)) {
        			cont++;        			
        		}
        	}
        	if (cont<= 2) {
       		 System.out.println("O número " + num[i] + " na posição " + (i + 1) + " é primo.");
       	}
        	
        }
    }
}
