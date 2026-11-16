package reto;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int eleccion = 0;
			System.out.println("Selecciona la conversión de peso:");
			System.out.println("1. Longitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("0. Salir");
			do {
				if (eleccion==1) {	
					Funciones1.longitud();
				}
				else if (eleccion==2) {
					Funciones1.peso();
					
				} else if (eleccion==3) {
					Funciones2.temperatura();
					
				} else if (eleccion==4) {
					Funciones2.volumen();
				}
			} while (eleccion !=0);
		}

	}
