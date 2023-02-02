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
	
	public static int pedirIdLibro (Integer id ,Scanner scan) {
		
		Libro libro = new Libro();

		System.out.println("Introduce el id del libro a eliminar");
		libro.setId(Integer.parseInt(scan.nextLine()));
		
		return libro.getId();
	}
	
	public static Libro ModificarDatosLibro (Libro libro, Scanner scan) {
		
		System.out.println("Introduce el id del libro a cambiar");
		libro.setId(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce el titulo del nuevo libro");
		libro.setTitulo(scan.nextLine());
		System.out.println("Introduce el autor del nuevo libro");
		libro.setAutor(scan.nextLine());
		System.out.println("Introduce el numero de paginas del libro");
		libro.setNum_Pag(Integer.parseInt(scan.nextLine()));
		
		return libro;
		
		
	}
}
