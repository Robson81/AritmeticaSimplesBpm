package poo;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		int a = 1;
		int b = 0;
		int aux;
		
		for (int i = 0; i < 30; i++) {
			
			System.out.print(a);
			if(i!=29)
				System.out.print(", ");
			else
				System.out.println(".");
			aux = a;
			a += b;
			b = aux;
		}

	}	
	}
	
	