package Pruebas;

import java.util.Scanner;

public class Ejercicio9_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado =new Scanner (System.in);
		
		int num,mult;
		mult=3;
		for (int i=1;i<=5;i+=1){
			System.out.println("dame un numero");
		num=teclado.nextInt();
		if (num%mult==0){
			System.out.println(num+" es multiplo de 3");
		}else{
				System.out.println("no es multiplo de 3");}
		}
		
	}
