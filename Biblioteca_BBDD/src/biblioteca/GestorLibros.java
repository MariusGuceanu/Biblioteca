package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {

	public static void run () throws SQLException, ClassNotFoundException {
		final int INSERTAR_LIBRO = 1;
		final int ELIMINAR_LIBRO = 2;
		final int OPCION_TRES = 3;
		final int SALIR = 0;

		Scanner scan = new Scanner(System.in);
		int opcion_menu;

		GestorBBDD gestorBBDD = new GestorBBDD();
		Libro libro = new Libro();
		do {
			System.out.println("------MENU-------");
			System.out.println(INSERTAR_LIBRO + ". Insertar libro");
			System.out.println(ELIMINAR_LIBRO + ". Eliminar libro");
			System.out.println(OPCION_TRES + ". Modificar libro");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case INSERTAR_LIBRO:
				gestorBBDD.conector();
				gestorBBDD.insertarLibros(libro, scan);
				gestorBBDD.cerrar();
				break;
			case ELIMINAR_LIBRO:
				System.out.println("segunda opcion seleccionada\n");
				break;
			case OPCION_TRES:
				System.out.println("tercera opcion seleccionada\n");
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
