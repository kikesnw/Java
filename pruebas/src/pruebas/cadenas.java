package pruebas;
import java.util.Scanner;
public class cadenas {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	String cad1;
	String cad2;
	System.out.print("Ingrese la primera cadena:");
	cad1=teclado.nextLine();
	System.out.print("Ingrese la segunda cadena:");
	cad2=teclado.nextLine();
	if (cad1.equals(cad2)==true) {
		System.out.println(cad1+" es exactamente igual a "+cad2);
        } else {
		System.out.println(cad1+" no es exactamente igual a "+cad2);        
	}
	if (cad1.equalsIgnoreCase(cad2)==true) {
		System.out.println(cad1+" es igual a "+cad2+" sin tener en cuenta may�sculas/min�sculas");
        } else {
		System.out.println(cad1+" no es igual a "+cad2+" sin tener en cuenta may�sculas/min�sculas");        
        }
	if (cad1.compareTo(cad2)==0) {
		System.out.println(cad1+" es exactamente igual a "+cad2);
	} else {
		if (cad1.compareTo(cad2)>0) {
			System.out.println(cad1+ " es mayor alfab�ticamente que "+cad2);
	} else
			System.out.println(cad2+ " es mayor alfab�ticamente que "+cad1);            
        }        
	System.out.println("El primer car�cter de "+cad1+" es "+cad1.charAt(0));
	System.out.println("La longitud de la cadena "+cad1+" es "+cad1.length());
	System.out.println("Los primeros tres caracteres de "+cad1+" son 	"+cad1.substring(0,3));
	int posi=cad1.indexOf(cad2);
	if (posi==-1) {
		System.out.println(cad2+" no est� contenido en "+cad1);
        } else {
		System.out.println(cad2+" est� contenido en "+cad1+" a partir de la posici�n "+posi);
        }
System.out.println(cad1+ " convertido a may�sculas es "+cad1.toUpperCase());
System.out.println(cad1+ " convertido a min�sculas es "+cad1.toLowerCase());        
  
  }

}
