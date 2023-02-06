package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorSocios {

	public static void run() throws SQLException {
		final int INSERTAR_SOCIO = 1;
		final int BORRAR_SOCIOS = 2;
		final int MODIFICAR_SOCIOS = 3;
		final int SALIR = 0;

		Scanner scan = new Scanner(System.in);
		int opcion_menu;

		GestorBBDD gestorBBDD = new GestorBBDD();
		Socio socio = new Socio();
		Integer id = null;
		
		do {
			System.out.println("------MENU-------");
			System.out.println(INSERTAR_SOCIO + ". Insertar socios");
			System.out.println(BORRAR_SOCIOS + ". Borrar socios");
			System.out.println(MODIFICAR_SOCIOS + ". Modificar socios");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case INSERTAR_SOCIO:
				gestorBBDD.conector();
				
				gestorBBDD.cerrar();
				break;
			case BORRAR_SOCIOS:
				
				break;
			case MODIFICAR_SOCIOS:
				
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
