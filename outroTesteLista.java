package poo;

import java.util.ArrayList;
import java.util.List;

import entities.EmployeeList;

public class outroTesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<EmployeeList> lista = new ArrayList<>();
		
		
		lista.add(new EmployeeList(333, "Maria Brown", 4000.0));
		lista.add(new EmployeeList(123, "Alex Green", 5000.0));
		lista.add(new EmployeeList(135, "Joana Pink", 3500.0));
		
		
		for (int i = 0; i < lista.size(); i++) {
			
		if(lista.get(i).getSalary()<4000.0) {
			
			lista.get(i).increaseSalary(12.5);
			System.out.println(lista);
		}
		}
		System.out.println("\n\n");
		for (EmployeeList employeeList : lista) {
			
			System.out.println(employeeList);
		}
		
		//lista.get(0).increaseSalary(10.5);
		System.out.println(lista.get(0).getSalary());
	
	
	
	}

}
