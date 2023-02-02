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
		System.out.println(GESTIONAR_LIBROS + ". Gestionar libros");
		System.out.println(GESTIONAR_SOCIOS + ". Gestionar socios");
		System.out.println(GESTIONAR_PRESTAMOS + ". Gestionar Prestamos");
		System.out.println(SALIR + ". Salir");
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
		
		    break;
		    
		case SALIR:
			System.out.println("ADIOS");
			break;
		}
			
		}while (opcion != SALIR);
	}
	
}
