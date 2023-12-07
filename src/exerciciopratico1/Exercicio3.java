package exerciciopratico1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Salário bruto
		
		Scanner leia= new Scanner(System.in);
		float bruto;
		
		System.out.println("Digite o salário bruto:");
		bruto= leia.nextFloat();
		System.out.println("O salário bruto é:"+bruto);
		
		
		//Adicional Noturno
		
		Scanner leia1= new Scanner(System.in);
		float adicional;
		
		System.out.println("Digite o adicional norturno:");
		adicional= leia1.nextFloat();
		System.out.println("O adicional noturno é:"+adicional);
		
		
		//Horas Extras
		
		
		Scanner leia2= new Scanner(System.in);
		float extras;
		
		
		System.out.println("Digite a horas extras:");
		extras= leia.nextFloat();
		System.out.println("As horas extras são:"+extras);
		
		
		// Descontos
		
		
		Scanner leia3= new Scanner(System.in);
		float descontos;
		
		
		System.out.println("Digite os descontos:");
		descontos= leia.nextFloat();
		System.out.println("Os descontos são:"+descontos);
		
		
		
		Float total= (bruto+adicional+extras*5)-descontos; 
		System.out.println("O salário líquido é"+total);
		
		
	}

}
