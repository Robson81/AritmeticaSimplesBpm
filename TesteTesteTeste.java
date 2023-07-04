package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteTesteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	int n ;
	String type; 
	do {
	System.out.print("Informe a quantidade de preços que deseja cadastrar (no máximo 20 valores): ");
	    n = sc.nextInt();
	if(n>20||n==0) 
		System.out.println("\nERRO! O programa admite apenas valores POSITIVOS E MENORES DO QUE 20.\n");	
	
	}while(n>20||n==0);
	
	System.out.println();
	
	List<Double> preco = new ArrayList<>();
	int[] vect = new int[n];
	
	for (int i = 0; i < vect.length; i++) {
		
		System.out.print((i+1)+"º preço: ");
		preco.add(sc.nextDouble());
	}
	
	
	do {
	System.out.println();
	System.out.print("Informe um preço para consultar a existência no cadastro anterior: ");
	int position = preco.indexOf(sc.nextDouble());
	if(position!=-1) {
		System.out.println("\nValor encontrado na posição: " + position );
	}else
	    System.out.println("\nValor não encontrado!");
	
	do {
		
		System.out.print("\nDeseja realizar uma  nova consultar? Entre com S para SIM ou N para NÃO: ");
		type = sc.next().toUpperCase();
		if(type.charAt(0) !='S'&&type.charAt(0) !='N')
			System.out.println("\nERRO!");
		
	}while(type.charAt(0) !='S'&& type.charAt(0) !='N');
	
	}while(type.charAt(0)!='N');
	
	System.out.println("\nPROGRAMA: PESQUISANDO VALOR, ENCERRADO\n");
	 
	for (int i : vect) {
		
	}
	
	
	sc.close();
	}

}
