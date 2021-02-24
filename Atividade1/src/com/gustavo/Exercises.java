package com.gustavo;

import java.util.ArrayList;
import java.util.Random;

import java.util.Collections;
import java.util.Scanner;

public class Exercises {
	Scanner input = new Scanner(System.in);

	public void exerciseTwoA() {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Digite um valor");
		numbers.add(input.nextInt());
		
		System.out.println("Digite um novo valor");
		numbers.add(input.nextInt());
		
		System.out.println("Digite um novo valor");
		numbers.add(input.nextInt());

		Collections.sort(numbers);
		
		int a = numbers.get(0);
		int b = numbers.get(1);
		int c = numbers.get(2);

		System.out.println("A = " + a + ", B = " + b + ", C = " + c);
	}
	
	public void exerciseTwoB() {
		System.out.println("Digite um número de 1 a 9");
		int number = input.nextInt();
		
		if(number >= 1 && number <=9)
			System.out.println("O valor está na faixa permitida");
		else
			System.out.println("O valor não está na faixa permitida");

	}
	
	public void exerciseTwoC() {
		
		System.out.println("Digite o valor do primeiro lado");
		int x = input.nextInt();
		
		System.out.println("Digite o valor do segundo lado");
		int y = input.nextInt();
		
		System.out.println("Digite o valor do terceiro lado");
		int z = input.nextInt();
		
	    if ((z < x + y) && (y < z + x) && (x < z + y)) {
	        if ((x == y) && (y == z))
	        	 System.out.println("Triângulo equilátero");
	        else if ((x != y) && (y != z) && (z != x))
	        	 System.out.println("Triângulo escaleno");
	        else
	        	 System.out.println("Triângulo Isóceles");
	    } else {
	    	System.out.println("Não é um triângulo");
	    }
		
	}
	
	public void exerciseThreeA(int num) {
		 if(num < 0) 
			 System.out.println("Não é triangular");
		 
		 int sum = 0; 
		 boolean isTriangular = false;
        
	        for (int i = 1; sum <= num; i++) {
	            sum += i; 
	            if (sum == num) 
	                isTriangular = true;

	        } 
	     if(isTriangular) 
	    	 System.out.println("É triangular");
	     else
	    	 System.out.println("Não é triangular");
	}
	
	public void exerciseThreeB(int n) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		Random randomNumber = new Random();
		
		int greaterNumber = 0;
		int lowerNumber = 6;
		
		int counterOfNumbers[] = new int[6];	
		
		for(int i = 0; i < n; i++) {
			int value = randomNumber.nextInt(6) + 1;
			
			numbers.add(value);
			
			System.out.println("Numero sorteado: " + value);
			
			counterOfNumbers[value - 1] += 1;
			
			if(value > greaterNumber)
				greaterNumber = value;
			if(value < lowerNumber)
				lowerNumber = value;
		}
		
		System.out.println("Maior número sorteado: " + greaterNumber);
		System.out.println("Menor número sorteado: " + lowerNumber);
		
		for(int i = 0; i < counterOfNumbers.length; i++) {
			System.out.println("O número " + (i + 1) + " apareceu " + counterOfNumbers[i] + " vez(es)");
		}
	}
	
	public void exerciseThreeC(int n) {
		int numbers[] = new int[n * -1];
		int length = n * -1;
		
		for(int i = 0; i < length; i++) {
			numbers[i] = n;
			System.out.println(numbers[i]);
			n++;
		}
	}
	
}
