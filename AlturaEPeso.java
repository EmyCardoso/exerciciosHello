package exerciciosHello;

import java.util.Scanner;

public class AlturaEPeso {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite sua altura");
		double altura = leitor.nextDouble();
		
		System.out.println("digite seu peso");
		double peso = leitor.nextDouble();
		
		double imc = peso / (altura * altura);
	
		
	    
		leitor.close();

		
		
	}
  
}
