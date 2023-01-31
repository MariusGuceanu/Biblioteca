package biblioteca;

import java.util.Scanner;

public class FormulariosDedatos {

	public static Libro pedirDatosLibro(Scanner scan) {
		
		Libro libro = new Libro();
		
		System.out.println("Insertar libro");
		System.out.println("Introduce el titulo del libro");
		libro.setTitulo( scan.nextLine());
		System.out.println("Introduce el nombre su autor");
		libro.setAutor(scan.nextLine());
		System.out.println("Introduce el numero de paginas");
		libro.setNum_Pag(Integer.parseInt(scan.nextLine()));
		
		return libro;
		
	}
}
