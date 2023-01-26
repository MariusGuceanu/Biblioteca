package biblioteca;

import java.util.Scanner;

public class Menu {

	public static void main (String [] args) {
		final int OPCION_LIBROS = 1;
		final int OPCION_SOCIOS = 2;
		final int OPCION_PRESTAMOS = 3;
		final int SALIR = 0;

		Scanner scan = new Scanner(System.in);
		int opcion_menu;

		do {
			System.out.println("------MENU PRINCIPAL-------");
			System.out.println(OPCION_LIBROS + ". Gestionar libros");
			System.out.println(OPCION_SOCIOS + ". Gestionar socios");
			System.out.println(OPCION_PRESTAMOS + ". Gestionar prestamos");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case OPCION_LIBROS:
				System.out.println("Gestion de libros\n");
				System.out.println("¿Que desea hacer?");
				System.out.println("Insertar libros");
				System.out.println("Eliminar libros");
				System.out.println("Ver libros");
				break;
			case OPCION_SOCIOS:
				System.out.println("Gestion de socios\n");
				System.out.println("¿Que desea hacer?");
				System.out.println("Ver socios");
				break;
			case OPCION_PRESTAMOS:
				System.out.println("Gestion de prestamos\n");
				System.out.println("¿Que desea hacer?");
				System.out.println("Realizar prestamo");
				break;
			case SALIR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion_menu != SALIR);
		scan.close();

	}
	
}
