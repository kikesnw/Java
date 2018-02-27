package pruebas;
import java.util.Scanner;
public class Apellidos {
	
			Scanner teclado=new Scanner(System.in);
			String   apellido1;
			String   apellido2;
			String   nombre;

		public Apellidos(String apl,String apel){
			apellido1=apl;
			apellido2=apel;
					
		}
		public Apellidos(String nomb,String apl,String apel){
			nombre=nomb;
			apellido1=apl;
			apellido2=apel;	
			
		}
		public  void comparar(){

			if (apellido1.equals(apellido2)==true) {
				System.out.println(apellido1+" es exactamente igual a "+apellido2);
		        } else {
				System.out.println(apellido1+" no es exactamente igual a "+apellido2);        
			}
			System.out.print(nombre+"\t");
			System.out.print(apellido1+"\t");
			System.out.println(apellido2);
		}
			public static void main(String[] args) {
				
				
	Apellidos apellido =new Apellidos("sanche","sanchez");
	Apellidos nombre =new Apellidos("Pilar","sanchez");
				apellido.comparar();
				nombre.comparar();

		}
}
