package ejercicio1;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		double precio;
		double IVA;
		
		
		System.out.println("ingrese el precio");
		precio= scanner.nextDouble();
		
		IVA=calcular(precio);
		
		System.out.println("el precio con iva incluido es :" + (precio+IVA));
		
		
		
}
	public static double calcular(double p) {
		double IVA;
		IVA = p*0.18;
		return IVA;
		}
	
}
