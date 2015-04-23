import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class youcansayeleven {

    public static void main(String[]argumentos) throws IOException{


       BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
       for(;;){
       String numero = teclado.readLine();
       if(numero.length()==1)
         if (Integer.parseInt(numero)==0)
    	       break;
       int par = 0;
       int imp = 0;
       int fin = 0;

       for (int i = 0; i<numero.length(); i++){


            char a = numero.charAt(i);
            int number = Integer.parseInt(a+"");
            if(i%2==0)
               par += number;
            else
               imp += number;
        }


        fin = par - imp;

      if (fin==0 || fin%11==0)
        System.out.println(numero+ " Is a multiple of 11.");
      else
        System.out.println(numero+" Is not a multiple of 11.");




    }


    }
}
