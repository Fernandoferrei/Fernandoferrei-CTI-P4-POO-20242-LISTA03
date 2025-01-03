package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X[] = new int[10];
        int Y[] = new int[10];
        int U[] = new int[20];       
        int D[] = new int[10];
        int S[] = new int[10];
        int P[] = new int[10];
        int IT[] = new int[10];
        
        int i, j, k;
        int cont_u, cont_d, cont_i;
        
        
        for (i = 0; i < 10; i++) { 
            System.out.println("X[" + i + "]:");
            X[i] = sc.nextInt();
            
            System.out.println("Y[" + i + "]:");
            Y[i] = sc.nextInt();
        }
        
        cont_u = 0;
        cont_d = 0; 
        cont_i = 0;
        
       
        for (i = 0; i < 10; i++) { 
            j = 0;
            
            while ((j < cont_u) && (X[i] != U[j])) {
                j++;
            }
            
            if (j == cont_u) {
                U[cont_u] = X[i];
                cont_u++;
            }
        }
        
        for (i = 0; i < 10; i++) { 
            j = 0;
            
            while ((j < cont_u) && (Y[i] != U[j])) {
                j++;
            }
            
            if (j == cont_u) {
                U[cont_u] = Y[i];
                cont_u++;
            }
        }
        
       
        for (i = 0; i < cont_u; i++) {
            System.out.println("U[" + i + "]: " + U[i]);
        }
        
       
        for (i = 0; i < 10; i++) {
            j = 0;
            
            while ((j < 10) && (X[i] != Y[j])) {
                j++;
            }
            
            if (j == 10) {
                k = 0;
                
                while ((k < cont_d) && (X[i] != D[k])) {
                    k++;
                }
                
                if (k == cont_d) {
                    D[cont_d] = X[i];
                    cont_d++;
                }
            }
        }
        
       
        for (i = 0; i < cont_d; i++) {
            System.out.println("D[" + i + "]: " + D[i]);
        }
        
       
        for (i = 0; i < 10; i++) { 
            S[i] = X[i] + Y[i];
            P[i] = X[i] * Y[i];
        }
        
       
        for (i = 0; i < 10; i++) { 
            System.out.println("P[" + i + "]: " + P[i]);
        }
        
       
        for (i = 0; i < 10; i++) { 
            j = 0;
            
            while ((j < 10) && (X[i] != Y[j])) {
                j++;
            }
            
            if (j < 10) {
                k = 0;
                
                while ((k < cont_i) && (IT[k] != X[i])) {
                    k++;
                }
                
                if (k == cont_i) {
                    IT[cont_i] = X[i];
                    cont_i++;
                }
            }
        }
        
        
        for (i = 0; i < cont_i; i++) {
            System.out.println("IT[" + i + "]: " + IT[i]);
        }
        
        sc.close();
    }
}
