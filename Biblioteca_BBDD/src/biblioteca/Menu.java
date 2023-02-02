package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
	
	public static final int GESTIONAR_LIBROS = 1;
	public static final int GESTIONAR_SOCIOS = 2;
	public static final int GESTIONAR_PRESTAMOS = 3;
	
	public static final int SALIR = 0;
	
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
	public static final int MODIFICAR_LIBRO = 3;
	
	public static void mostrarMenuPrincipal() throws ClassNotFoundException, SQLException {
		Menu menu = new Menu();
		Scanner scan = new Scanner (System.in);
		int opcion;
		do {
		System.out.println("---Menu Principal---");
		System.out.println("Gestionar libros");
		System.out.println("Gestionar socios");
		System.out.println("Gestionar Prestamos");
		opcion = Integer.parseInt(scan.nextLine());
		switch (opcion) {
		case GESTIONAR_LIBROS:
			GestorLibros.run();
			
			break;
		
		case GESTIONAR_SOCIOS:
			GestorSocios.run();
			
			break;
			
		case GESTIONAR_PRESTAMOS:
			System.out.println("Confia");
			}
		}while (opcion != 0);
	}
	
}
