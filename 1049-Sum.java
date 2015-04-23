import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
 	Scanner entrada=new Scanner(System.in);
 
	int x, total=0;

		
	int a = entrada.nextInt();
	if(a>0){	
	
		for(x=1;x<=a  ;x=x+1){
			total=total+x;
			    
	 	}
	}else{
		for(x=1;x>=a  ;x=x-1){
			total=total+x;
			    
	 	}
	}
	System.out.print(total);
    }
}
		
