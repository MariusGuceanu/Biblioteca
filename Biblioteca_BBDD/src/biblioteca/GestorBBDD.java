package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GestorBBDD extends Conector {

	public void insertarLibros (Libro libro, Scanner scan) throws ClassNotFoundException, SQLException {
		
		libro = FormulariosDedatos.pedirDatosLibro(scan);
		PreparedStatement preparedSt = getCn().prepareStatement("INSERT INTO libros (titulo, autor, num_Pag) VALUES (?,?,?)");
		preparedSt.setString(1 , libro.getTitulo());
		preparedSt.setString(2, libro.getAutor());
		preparedSt.setInt(3, libro.getNum_Pag());
		preparedSt.execute();
		
	}
	
	public void eliminarLibro (Integer id, Scanner scan) throws ClassNotFoundException, SQLException {
		
		Libro libro;
		id = FormulariosDedatos.pedirIdLibro(id, scan);
		PreparedStatement preparedSt = cn.prepareStatement("DELETE FROM libros WHERE id = ?");
		preparedSt.setInt(1, id);
		preparedSt.execute();
		
		
	}
	
	
}

