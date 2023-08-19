package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
	
		
		
		System.out.println("Digite os lados do triangulo X: ");
		 x.a = sc.nextDouble();
		 x.b = sc.nextDouble();
		 x.c = sc.nextDouble();
		
		System.out.println("Digite os lados do triangulo Y: ");
		 y.a = sc.nextDouble();
		 y.b = sc.nextDouble();
		 y.c = sc.nextDouble();
		 
		 double first = x.area();
		 double second = y.area();
		 
		 
		 System.out.printf("Triangle X area: %.4f%n", first);
		 System.out.printf("Triangle Y area: %.4f%n", second);
		 
		 if(first>second) {
			 System.out.printf("Larger area X" );
		 } else {
			 System.out.printf("Larger area Y");
		 }
		 

	}

}
