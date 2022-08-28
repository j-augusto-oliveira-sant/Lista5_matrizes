package exercicios_resolvidos;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tam=0,soma=0,maior=0,menor=0,num_par=0,num_impar=0;
		int soma_diagonal_prin=0,soma_diagonal_sec=0;
		double media;
		while ((tam<3 && tam>11) || tam%2==0) {
			System.out.println("TAMANHO:");
			tam = scan.nextInt();
		}
		
		int[][] matriz = new int[tam][tam];
		for (int i=0;i<tam;i++) {
			for (int j=0;j<tam;j++) {
				System.out.println("("+i+","+j+")");
				matriz[i][j] = scan.nextInt();
			}
		}
		
		int pos_diagonal_p=0;
		int pos_diagonal_s=tam-1;
		for (int i=0;i<tam;i++) {
			for (int j=0;j<tam;j++) {
				System.out.print(matriz[i][j]);
				//soma total
				soma += matriz[i][j];
				//pares e impares
				if (matriz[i][j]%2==0) {
					num_par += matriz[i][j];
				} else {
					num_impar += matriz[i][j];
				}
				//soma diagonal principal
				if (j==pos_diagonal_p) {
					soma_diagonal_prin += matriz[i][j];
				}
				//soma diagonal secundaria
				if (j==pos_diagonal_s) {
					soma_diagonal_sec += matriz[i][j];
				}
				//maior
				if (matriz[i][j] < menor || (i==0&&j==0)) {
					menor = matriz[i][j];
				}
				//menor
				if (matriz[i][j] > maior || (i==0&&j==0)) {
					maior = matriz[i][j];
				}
			}
			pos_diagonal_p += 1;
			pos_diagonal_s -= 1;
			System.out.println();
		}
		
		System.out.println("-------");
		//soma
		media = (soma/(tam*tam));
		System.out.println("Media: "+media);
		System.out.println("Menor: "+menor);
		System.out.println("Maior: "+maior);
		System.out.println("Soma total: "+soma);
		System.out.println("Soma pares: "+num_par);
		System.out.println("Soma impares: "+num_impar);
		System.out.println("Soma Diagonal Principal: "+soma_diagonal_prin);
		System.out.println("Soma Diagonal Secundaria: "+soma_diagonal_sec);
		scan.close();
	}

}
