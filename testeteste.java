package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;

public class testeteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		

		List<EmployeeList> lista = new ArrayList<>();
		
		System.out.print("Informe quantos empregados dejesa cadastrar: ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			lista.add(new EmployeeList(id, name, salary));
			System.out.println();

		}
		
		/*lista.add(new EmployeeList(333, "Maria Brown", 4000.0) );
		lista.get(0).increaseSalary(10.5);
		System.out.println(lista.get(0).getSalary());*/
		

		System.out.print("Entre com a Id do funcionario que receberá um reajuste: ");
		int _id = sc.nextInt();

		EmployeeList emp = lista.stream().filter(x -> x.getId() == _id).findFirst().orElse(null);

		if (emp == null) {

			System.out.print("Id Invalido");
		}

		else {

			System.out.print("Informe a taxa de reajuste: ");
			double increase = sc.nextDouble();

			emp.increaseSalary(increase);
		}
		System.out.println("\n");
		for (EmployeeList obj : lista) {

			System.out.println(obj.toString());
		}

		sc.close();
	
	
	
	
	
	
	
	
	
	
	
	}

}
