package exercicios_resolvidos;

import java.util.Scanner;
import java.util.Random;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		//loteria com 6 números de 1 a 60.
		System.out.println("Quantas cartelas:");
		final int TAM = scan.nextInt();
		//cartelas[6] == acertos
		int[][] cartelas = new int[TAM][7];
		int[] resultado = new int[6];
		
		for (int i=0;i<TAM;i++) {
			System.out.println("Cartela "+(i+1));
			for (int j=0;j<6;j++) {
				//resultado
				resultado[j] = random.nextInt(61);
				//
				do {
					System.out.println("Informe numero: "+j);
					cartelas[i][j] = scan.nextInt();
				} while (cartelas[i][j] < 0 || cartelas[i][j] > 60);
			}
		}
		int acertos =0;
		for (int i=0;i<=TAM;i++) {
			acertos = 0;
			System.out.println("---------");
			if (i<TAM) {
				System.out.println("Cartela "+(i+1));
			} else {
				System.out.println("Resultado");
			}
			for (int j=0;j<6;j++) {
				if (i<TAM) {
					if (cartelas[i][j] == resultado[j]) {
						System.out.println(cartelas[i][j]+" acertou");
						acertos += 1;
					} else {
						System.out.println(cartelas[i][j]);
					}
				} else {
					System.out.println(resultado[j]);
				}
			}
			System.out.println("Acertos: "+acertos);
		}
		
		scan.close();
	}

}
