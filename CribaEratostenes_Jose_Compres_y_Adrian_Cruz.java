package com.algyests.prac1;

import java.util.Scanner;

public class CribaEratostenes_Jose_Compres_y_Adrian_Cruz {
	
	
	
	
	//José Miguel Comprés Arias - 10153259
	//Adrian Cruz Santana - 10154816
	
	
	
	
	
	
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Ingrese N: ");
		int n = sc.nextInt();
		int []numbers = new int[n-1];
		for (int i = 2; i<=n; i++) numbers[i-2] = i;
		
		//Criba
		long iTime = System.nanoTime(); //tiempo en que empieza
		for(int i = 0; i<Math.sqrt(n)-1; i++) //-1 porque el primer número en el arreglo es el 2
		{
			if (numbers[i] == -1) continue;
			for (int j = i+1; j<n-1; j++)
			{
				if (numbers[j]==-1) continue;
				if (numbers[j]%numbers[i] == 0) numbers[j] = -1;
			}
		}
		long fTime = System.nanoTime(); //tiempo en que termina
		
		//imprimir los números
		for (int i = 0; i<n-1; i++) 
			if(numbers[i] != -1)
				System.out.println(numbers[i]);
		
		//tiempo
		double ntime = fTime-iTime;
		System.out.println("Tiempo de ejecución: "+ntime+" nanosegs ("+(ntime*0.000000001)+" segs)");
	}

}
