package exerciciosHello;

import java.util.Scanner;

public class UtilizandoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
	    double nota1, nota2, nota3, nota4, media;

	    System.out.println("Digite a primeira nota:");
	    nota1 = leitor.nextDouble();

	    System.out.println("Digite a segunda nota:");
	    nota2 = leitor.nextDouble();
	    
	    System.out.println("Digite a terceira nota:");
	    nota3 = leitor.nextDouble();

	    System.out.println("Digite a quarta nota:");
	    nota4 = leitor.nextDouble();

	    media = (nota1 + nota2 + nota3 + nota4) / 4;
	    
	    if (media >= 7) {
	        System.out.println("Parabéns! Você está aprovado.");
	      } else {
	        System.out.println("Você está reprovado.");
	}
	    leitor.close(); 
	    
   } 
}
