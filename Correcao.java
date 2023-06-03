import java.util.Scanner;

public class maiormenor {
    public static void main(String[] args) {
        // ler o que está sendo digitado pelo usuario
		    Scanner teclado = new Scanner(System.in); // Instanciar
	
        System.out.println("Digite o primeiro inteiro");
		    int n1 = teclado.nextInt(); // ler um número inteiro
        System.out.println("Digite o segundo");
        int n2 = teclado.nextInt(); // ler um número inteiro
        
        if (n1 > n2){ // n1 = 10 for maior que n2
    	    System.out.print(n1 + " O primeiro número é maior que o segundo");
        }else{
    	    System.out.println(n2 + " O segundo número é maior que o primeiro");
        }
       teclado.close();
	}
}
