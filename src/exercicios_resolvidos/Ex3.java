package exercicios_resolvidos;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantidade Alunos:");
		final int N = scan.nextInt();
		double nota1,nota2,soma_medias_turma=0,maior_nota=0,
				menor_nota=0,media=0,maior_media=0,menor_media=0;
		String sMaior_nota="",sMenor_nota="",sMaiorMedia="",sMenorMedia="";
		//3 = media
		String[][] alunos = new String[N][4];
		for (int i=0;i<N;i++) {
			System.out.println("Aluno "+i);
			System.out.println("Nome:");
			scan.nextLine();
			alunos[i][0] = scan.nextLine();
			System.out.println("Nota 1:");
			nota1 = scan.nextDouble();
			System.out.println("Nota 2:");
			nota2 = scan.nextDouble();
			//maior nota
			if (nota1 > maior_nota || i==0) {
				maior_nota = nota1;
				sMaior_nota = alunos[i][0];
			}
			if (nota2 > maior_nota || (i==0 && nota2 > nota1)) {
				maior_nota = nota2;
				sMaior_nota = alunos[i][0];
			}
			//menor nota
			if (nota1 < menor_nota || i==0) {
				menor_nota = nota1;
				sMenor_nota = alunos[i][0];
			}
			if (nota2 < menor_nota || (i==0 && nota2 < nota1)) {
				menor_nota = nota2;
				sMenor_nota = alunos[i][0];
			}
			//media aluno
			media = (nota1+nota2)/2;
			alunos[i][3] = String.valueOf(media);
			//maior media
			if (media > maior_media || i==0) {
				maior_media = media;
				sMaiorMedia = alunos[i][0];
			}
			//menor media
			if (media < menor_media || i==0) {
				menor_media = media;
				sMenorMedia = alunos[i][0];
			}
			//soma das medias
			soma_medias_turma += media;
			//
			alunos[i][1] = String.valueOf((float)nota1);
			alunos[i][2] = String.valueOf((float)nota2);
		}
		
		//menor nota
		System.out.println("Menor Nota: "+menor_nota+" Aluno: "+sMenor_nota);
		//maior nota
		System.out.println("Maior Nota: "+maior_nota+" Aluno: "+sMaior_nota);
		//maior media
		System.out.println("Maior Media: "+maior_media+" Aluno: "+sMaiorMedia);
		//menor media
		System.out.println("Menor Media: "+menor_media+" Aluno: "+sMenorMedia);
		//media geral
		double media_geral = soma_medias_turma/N;
		System.out.println("Media Geral: "+media_geral);
		//alunos abaixo da media
		System.out.println("ABAIXO DA MEDIA--");
		for (int i=0;i<N;i++) {
			if (Double.valueOf(alunos[i][3]) < media_geral) {
				System.out.println(alunos[i][0]+" Media: "+alunos[i][3]);
			}
		}
		//aluno acima da media
		System.out.println("ACIMA DA MEDIA--");
		for (int i=0;i<N;i++) {
			if (Double.valueOf(alunos[i][3]) >= media_geral) {
				System.out.println(alunos[i][0]+" Media: "+alunos[i][3]);
			}
		}
		
		scan.close();
	}

}
