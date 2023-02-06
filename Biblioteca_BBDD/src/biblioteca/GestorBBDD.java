package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorBBDD extends Conector {

	public void insertarLibros(Libro libro, Scanner scan) throws ClassNotFoundException, SQLException {

		PreparedStatement preparedSt = getCn()
				.prepareStatement("INSERT INTO libros (titulo, autor, num_Pag) VALUES (?,?,?)");
		preparedSt.setString(1, libro.getTitulo());
		preparedSt.setString(2, libro.getAutor());
		preparedSt.setInt(3, libro.getNum_Pag());
		preparedSt.execute();

	}

	public void eliminarLibro(Integer id, Scanner scan) throws ClassNotFoundException, SQLException {

		Libro libro;
		PreparedStatement preparedSt = cn.prepareStatement("DELETE FROM libros WHERE id = ?");
		preparedSt.setInt(1, id);
		preparedSt.execute();

	}

	public void modificarLibro(Libro libro, Scanner scan) throws SQLException {

		PreparedStatement preparedSt = cn.prepareStatement("UPDATE libros SET titulo=? WHERE id = ?");
		preparedSt.setString(1, libro.getTitulo());
		preparedSt.setInt(2, libro.getId());
		preparedSt.executeUpdate();

		preparedSt = cn.prepareStatement("UPDATE libros SET autor=? WHERE id = ?");
		preparedSt.setString(1, libro.getAutor());
		preparedSt.setInt(2, libro.getId());
		preparedSt.executeUpdate();

		preparedSt = cn.prepareStatement("UPDATE libros SET num_Pag=? WHERE id = ?");
		preparedSt.setInt(1, libro.getNum_Pag());
		preparedSt.setInt(2, libro.getId());
		preparedSt.executeUpdate();
	}

	public ArrayList<Libro> getLibros() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Statement st;
		try {
			st = this.cn.createStatement();
			ResultSet rs = st.executeQuery("select * from libros");

			Libro libro;
			while (rs.next()) {
				libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setAutor(rs.getString("autor"));
				libro.setNum_Pag(rs.getInt("num_pag"));

				libros.add(libro);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return libros;
	}
	
	public void insertarSocios(Socio socio, Scanner scan) throws ClassNotFoundException, SQLException {

		PreparedStatement preparedSt = getCn()
				.prepareStatement("INSERT INTO libros (titulo, autor, num_Pag) VALUES (?,?,?)");
	//	preparedSt.setString(1, socio.getTitulo());
		//preparedSt.setString(2, socio.getAutor());
	//	preparedSt.setInt(3, socio.getNum_Pag());
//		preparedSt.execute();

	}
	
}
