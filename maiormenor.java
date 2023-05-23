package exerciciosHello;
/**
 * 
 * @author emimi
 *
 */
import java.util.Scanner;

// cria um algoritmo que receba dois números e verifique, 
//qual é o maior e qual é o menor e exiba no console. 
//Exemplo de saida: "NumeroA é maior que númeroB"

public class maiormenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		int n1=20;
        int n2=10;
        int maior;
        
      if (n1 > n2){
       
    	  maior= n1;
      }else{
    	  maior =n2;
      }
       System.out.println("maior" + maior );

       System.out.println("n1 é maior que n2");
       leitor.close();
	}
	


}