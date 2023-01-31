package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestorBBDD extends Conector {

	public void insertarLibros (Libro libro) throws ClassNotFoundException, SQLException {
				
		PreparedStatement preparedSt = cn.prepareStatement("INSERT INTO animales (nombre) VALUES (?)");
		preparedSt.setString(1 , libro.getTitulo());
		preparedSt.setString(2, libro.getAutor());
		preparedSt.setInt(3, libro.getNum_Pag());
		preparedSt.execute();
		
	}
	
	public void eliminarLibro (int id) throws ClassNotFoundException, SQLException {
			
		PreparedStatement preparedSt = cn.prepareStatement("DELETE FROM libros WHERE id = ?");
		preparedSt.setInt(1, id);
		preparedSt.execute();
		
		
	}
	
	
}

