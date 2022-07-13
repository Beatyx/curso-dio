package dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b= scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		double divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Divisão: " + divisao);
		System.out.println("Multiplicação: " + multiplicacao);
	
	}
	
	
	public static int soma(int a, int b ) {
		return a + b;
	}
	public static int subtracao(int a, int b ) {
		return a - b;
	}
	public static double divisao(int a, int b ) {
		return a / b;
	}
	public static int multiplicacao(int a, int b ) {
		return a * b;
	}
	
	
	
}
