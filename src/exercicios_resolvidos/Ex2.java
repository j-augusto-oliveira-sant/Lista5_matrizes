package exercicios_resolvidos;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double soma_produtos=0,soma_local=0,mais_barato=Double.MAX_VALUE,mais_caro=0;
		double[][] mercados = new double[5][6];
		//6 = Soma do mercado
		for (int i=0;i<5;i++) {
			System.out.println("Mercado "+i);
			soma_local = 0;
			for (int j=0;j<=5;j++) {
				if (j<5) {
					System.out.println("Produto "+j);
					mercados[i][j] = scan.nextDouble();
					soma_local += mercados[i][j];
					soma_produtos += mercados[i][j];
				} else {
					mercados[i][j] = soma_local;
					if (mercados[i][j] < mais_barato || (i==0 && j==0)) {
						mais_barato = mercados[i][j];
					}
					if (mercados[i][j] > mais_caro || (i==0 && j==0)) {
						mais_caro = mercados[i][j];
					}
				}
			}
		}
		
		for (int i=0;i<5;i++) {
			System.out.println("--Mercado "+i+" Precos:");
			for (int j=0;j<=5;j++) {
				if (j<5) {
					System.out.println("R$"+mercados[i][j]);
				} else {
					System.out.println("Soma: R$"+mercados[i][j]);
				}
			}
		}
		System.out.println("Mais caro: "+mais_caro);
		System.out.println("Mais barato: "+mais_barato);
		System.out.println("Soma total produtos: R$"+soma_produtos);
		
		scan.close();
	}

}
