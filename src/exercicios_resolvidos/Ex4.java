package exercicios_resolvidos;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int TAM = 5;
		double soma=0,maior=0,menor=0;
		double[][] atletas = new double[TAM][6];
		//atletas[5] == media
		for (int i=0;i<TAM;i++) {
			soma = 0;
			System.out.println("ATLETA "+(i+1));
			for (int j=0;j<=5;j++) {
				if (j<5) {
					System.out.println("SALTO "+(j+1));
					atletas[i][j] = scan.nextDouble();
					soma += atletas[i][j];
				} else {
					atletas[i][j] = soma/5;
					if (atletas[i][j] > maior || i==0) {
						maior = atletas[i][j]; 
					}
					if (atletas[i][j] < menor || i==0) {
						menor = atletas[i][j]; 
					}
				}
			}
		}
		
		
		for (int i=0;i<TAM;i++) {
			System.out.println("----------");
			System.out.println("ATLETA "+(i+1));
			for (int j=0;j<=5;j++) {
				if (j<5) {
					System.out.println("SALTO "+(j+1)+": "+atletas[i][j]);
				} else {
					System.out.println("Media: "+atletas[i][j]);
				}
			}
		}
		System.out.println("Menor: "+menor);
		System.out.println("Campeao: "+maior);
		
		scan.close();
	}

}
