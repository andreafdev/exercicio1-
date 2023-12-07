package exerciciopratico1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// Salario
		Scanner leia= new Scanner(System.in);
		float salario;
		
		System.out.println("Digite seu salário: ");
		salario= leia.nextFloat(); 
		System.out.println("Seu salário é:"+salario);
		
		
		 // Abono
		
		Scanner leia1= new Scanner(System.in);
		float abono;
		
		System.out.println("Digite seu abono: ");
		abono= leia1.nextFloat(); 
		System.out.println("Seu abono é:"+abono);
		
		//Total
		
		float NovoSalario= salario+abono;
		System.out.println("Seu novo salário é: "+NovoSalario);
		
		
	}

}
