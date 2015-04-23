import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner; 


public class DivisibilityBy495 {

    public static void main(String[]argumentos) throws IOException{

        Scanner entrada = new Scanner(System.in);

        int T = entrada.nextInt();
        while ( T>0 ){

 	    	 T = T-1;   
   	   
       BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
      
      
   		
   		String N = teclado.readLine();
      
       int par = 0;
       int r=18;
       	int x=0;
       	int y=5;
       
       		
       for (int i = 0; i<N.length(); i++){

            char a = N.charAt(i);
            int number = Integer.parseInt(a+"");
               par += number;
           
               
        }
       int a = N.length();
		char b = N.charAt(a-1);
			int last = Integer.parseInt(b+"");
			
			if(par==r && last==x || last==y) 
				System.out.println("YES");
			else
				System.out.println("NO");
       	
       	}
    }


    }
