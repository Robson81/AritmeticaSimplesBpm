package poo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.BpmClass;

public class BPM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("\nCOMBINAÇÃO SIMPLES:");

		double aux = 0;
		double fatorial1 = 1;
		double fatorial2 = 1;
		double fatorial3 = 1;
		String type2;
		double n = 60;
		double m = 6;
		double aux2 = n - m;
		double i = 0;

		i = n;
		while (i >= 1) {

			fatorial1 = fatorial1 * (n - aux);
			aux += 1;
			i--;
		}
		i = m;
		aux = 0;
		while (i >= 1) {

			fatorial2 = fatorial2 * (m - aux);
			aux += 1;
			i--;
		}
		i = aux2;
		aux = 0;
		while (i >= 1) {

			fatorial3 = fatorial3 * (aux2 - aux);
			aux += 1;
			i--;
		}
		System.out.println();
		System.out.println("Possibilidades de jogos com 6 números da Mega Sena: " + fatorial1 / (fatorial2 * fatorial3));
		
		n = fatorial1 / (fatorial2 * fatorial3);
		
		Integer[] vect = new Integer[n];
	
	
	
	
	}

}
