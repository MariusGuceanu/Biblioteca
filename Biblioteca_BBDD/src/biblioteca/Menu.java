package biblioteca;

import java.util.Scanner;

public class Menu {
	
	public static final int GESTIONAR_LIBROS = 1;
	public static final int GESTIONAR_SOCIOS = 2;
	public static final int GESTIONAR_PRESTAMOS = 3;
	
	public static final int SALIR = 0;
	
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
	public static final int MODIFICAR_LIBRO = 3;
	
	public static void mostrarMenuPrincipal() {
		System.out.println("---Menu Principal---");
		System.out.println("Gestionar libros");
		System.out.println("Gestionar socios");
		System.out.println("Gestionar Prestamos");
	}
	
	public static void mostrarMenuLibros() {
		System.out.println("---Menu Libros---");
		System.out.println("Insertar libros");
		System.out.println("Eliminar libros");
		System.out.println("Ver libros");
	}
	
	public static void mostrarMenuSocios() {
		System.out.println("---Menu Socios---");
		System.out.println("Ver socios");
	}
	
	public static void mostrarMenuPrestamos() {
		System.out.println("---Menu Prestamos---");
		System.out.println("Hacer prestamo");
	}
}
