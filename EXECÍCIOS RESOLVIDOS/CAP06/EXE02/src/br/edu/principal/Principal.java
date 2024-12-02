package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int[] qtd = new int[10];
		int[] preco = new int[10];
		
		int i ,tot_geral= 0, tot_vend, comissao, maior, ind;
		tot_geral = 0;
		
		for(i = 1; i <10;i++ ) {
			System.out.println("digite a quantidade: "+ (i+1)+ ": ");
			qtd[i] = sc.nextInt();
			System.out.println("digite o preço: "+(i+1)+ ": ");
			preco[i] = sc.nextInt();
		}
		for(i= 1;i<10;i++ ) {
			tot_vend = qtd[i] * preco[i];
			System.out.println("Total vendido do item " + (i + 1) + ": " + tot_vend + " (Quantidade: " + qtd[i] + ", Preço: " + preco[i] + ")");
			tot_geral = tot_geral + tot_vend;
		}
		comissao = tot_geral * 5 /100;
		System.out.println("Total geral de vendas: " + tot_geral + " | Comissão: " + comissao);
		maior = qtd[0];
		ind = 0;
		for(i = 1; i<10;i++ ) {
			if(qtd[i] > maior) {
				maior = qtd[i];
				ind = i;
			}
		}
		   System.out.println("O item com a maior quantidade vendida foi o item " + (ind + 1) + " com " + maior + " unidades, e seu preço é " + preco[ind]);
		   sc.close();

	}

}
