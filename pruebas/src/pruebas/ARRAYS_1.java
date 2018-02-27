package pruebas;
import java.util.Scanner;
public class ARRAYS_1 {

		
		public static void main(String[] ar) {

			private Scanner teclado;
			private int[] sueldos;
			
			public void cargar(){
				teclado=new Scanner(System.in);
				sueldos=new int[5];
				for(int f=0;f<5;f++) {
					System.out.print("Introduzca el sueldo "+(f+1)+": ");
					sueldos[f]=teclado.nextInt();
			        }	
			}
			
			public void imprimir() {
				for(int f=0;f<5;f++) {
					System.out.println(sueldos[f]);
			        }
				
			}
		}
	}
