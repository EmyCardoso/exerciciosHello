package exerciciosHello;

import java.util.Scanner;

public class MaiorOuMenorIdade {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		 
		System.out.println("Qual sua idade?");
		 int idade = leitor.nextInt();
		 if (idade <18) {
			 System.out.println("Você é maior de iade");
			 
		 } else {
			 System.out.println("Você é menor de idade");
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		leitor.close();
	}

}
