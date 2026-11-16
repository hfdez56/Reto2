package reto;

import java.util.Scanner;

public class Funciones1 {

	public static double millas_kilometros(double n) {
		return n * 1.60934;
	}
	public static double kilometros_millas(double n) {
		return n / 1.60934;
	}
	
	public static void longitud() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona la conversión de longitud:");
		System.out.println("1. Millas a kilómetros");
		System.out.println("2. Kilómetros a millas");
		System.out.println("0. Salir");
		int eleccion = Integer.parseInt(sc.nextLine());
		do {
			if (eleccion==1) {
				System.out.println("Dime numero");
				int n = Integer.parseInt(sc.nextLine());
				System.out.println(millas_kilometros(n));
			}
			else if (eleccion==2) {
				int n = Integer.parseInt(sc.nextLine());
				System.out.println(kilometros_millas(n));
			}
		} while (eleccion !=0);
	}
	
	
	
	
	public static double kilogramos_libras(double n) {
		return n / 0.453592;
	}
	public static double libras_kilogramos(double n) {
		return n * 0.453592;
	}
	
	public static void peso() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona la conversión de peso:");
		System.out.println("1. Kilogramos a libras");
		System.out.println("2. Libras a kilogramos");
		System.out.println("0. Salir");
		int eleccion = Integer.parseInt(sc.nextLine());
		do {
			if (eleccion==1) {	
				System.out.println("Dime numero");
				int n = Integer.parseInt(sc.nextLine());
				System.out.println(kilogramos_libras(n));
			}
			else if (eleccion==2) {
				System.out.println("Dime numero");
				int n = Integer.parseInt(sc.nextLine());
				System.out.println(libras_kilogramos(n));
			}
		} while (eleccion !=0);
	}


}
