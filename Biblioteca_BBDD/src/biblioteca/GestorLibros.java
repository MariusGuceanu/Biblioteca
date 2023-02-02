package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {

	public static void run() throws SQLException, ClassNotFoundException {
		final int INSERTAR_LIBRO = 1;
		final int ELIMINAR_LIBRO = 2;
		final int MODIFICAR_LIBRO = 3;
		final int SALIR = 0;

		Scanner scan = new Scanner(System.in);
		int opcion;

		GestorBBDD gestorBBDD = new GestorBBDD();
		Libro libro = new Libro();
		Integer id = null;

		do {
			System.out.println("------MENU-------");
			System.out.println(INSERTAR_LIBRO + ". Insertar libro");
			System.out.println(ELIMINAR_LIBRO + ". Eliminar libro");
			System.out.println(MODIFICAR_LIBRO + ". Modificar libro");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			opcion = Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case INSERTAR_LIBRO:
				gestorBBDD.conector();
				gestorBBDD.insertarLibros(libro, scan);
				gestorBBDD.cerrar();

				Visor.mostrarMensaje("Libro insertado");
				break;

			case ELIMINAR_LIBRO:
				gestorBBDD.conector();
				gestorBBDD.eliminarLibro(id, scan);
				gestorBBDD.cerrar();

				Visor.mostrarMensaje("Libro eliminado");
				break;

			case MODIFICAR_LIBRO:
				gestorBBDD.conector();

				break;

			case SALIR:
				System.out.println("ADIOS");
				break;

			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion != SALIR);

	}
}
