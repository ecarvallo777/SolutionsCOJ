import java.util.Scanner;
import java.math.BigDecimal;
public class string{
	private static Scanner entrada;

	public static void main(String [] args){

		BigDecimal a=new BigDecimal("0");
		int cont=0;
		

		entrada = new Scanner(System.in);
 		

		while(cont<12){
			
			BigDecimal b= new BigDecimal(entrada.nextLine());
			a= a.add(b);
			cont=cont+1;
		}
		
   		

		System.out.format("$%.2f",a.divide(new BigDecimal("12"))) ;
	}
}
