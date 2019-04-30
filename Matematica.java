
public class Matematica {

	private int lerNumero;

	public int getLerNumero() {
		return lerNumero;
	}

	public void setLerNumero(int lerNumero) {
		this.lerNumero = lerNumero;
	}

	public int Fibonacci (int lerNumero) {
	        int F = 0;    
	        int ant = 0;   
	        for (int i = 1; i <= lerNumero; i++) {
	  
	            if (i == 1) {
	                F = 1;
	                ant = 0;
	            } else {
	                F += ant;
	                ant = F - ant;
	            }	  
	     	    }
	  	        return F;
	    }


	public void Fatorial (int lerNumero){ 
		
	int x = lerNumero;  
	int f = x; 

	while (x > 1){ 

	  f = f *(x-1); 
	  System.out.println(f); 
	             } 
	           } 
	} 
	


