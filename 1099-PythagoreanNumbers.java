import java.util.Scanner;

public class trigo{
	public static void main(String [] args){

		Scanner entrada= new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int x=0;
		int y=0;	

		

		
		
		while(true){
				
			a=entrada.nextInt();
			if(a==0) System.exit(0);
			b=entrada.nextInt();
			c=entrada.nextInt();

		if (c>b && b>a){
			
		 
				x=(a*a)+(b*b);
				y=(c*c);
	        	
		}else{
			if (b>c && c>a){
			
		 
				x=(a*a)+(c*c);
				y=(b*b);
	        	
			}else{
				if (a>b && b>c){
			
		 
					x=(b*b)+(c*c);
					y=(a*a);
	        	
				}
		}
		}
		if (x==y) 
			System.out.println("right");
		else
			System.out.println("wrong");
		
	
	}
	}
}
