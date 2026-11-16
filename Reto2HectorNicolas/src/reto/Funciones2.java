package reto;

import java.util.Scanner;

public class Funciones2 {

	public static double celsius_fahrenheit(double n1) {
		return (n1*1.8)+32;
	}
	
	public static double fahrenheit_celsius(double n1) {
		return (n1-32)/1.8;
	}
	
	public static double litros_galones(double n1) {
		return n1* 3.7854;
	}
	
	public static double galones_litros(double n1) {
		return n1/ 3.7854;
	}
	
	public static void temperatura() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige uno:");
		System.out.println("1. De celsius a fahrenheit");
		System.out.println("2. De fahrenheit a celsius");
		System.out.println("0. Salir");
		int eleccion = Integer.parseInt(sc.nextLine());
		int n = 0;
		do {
			if (eleccion == 1) {
				System.out.println("Un numero");
				n = Integer.parseInt(sc.nextLine());
				System.out.println(celsius_fahrenheit(n));
			}else if (eleccion == 2) {
				System.out.println("Un numero");
				n = Integer.parseInt(sc.nextLine());
				System.out.println(fahrenheit_celsius(n));
			}
		} while (eleccion!=0);
		sc.close();
	}
	
	public static void volumen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige uno:");
		System.out.println("1. De litros a galones");
		System.out.println("2. De galones a litros");
		System.out.println("0. Salir");
		int eleccion = Integer.parseInt(sc.nextLine());
		int n = 0;
		do {
			if (eleccion == 1) {
				System.out.println("Un numero");
				n = Integer.parseInt(sc.nextLine());
				System.out.println(celsius_fahrenheit(n));
			}else if (eleccion == 2) {
				System.out.println("Un numero");
				n = Integer.parseInt(sc.nextLine());
				System.out.println(fahrenheit_celsius(n));
			}
		} while (eleccion!=0);
		sc.close();
	}


}
