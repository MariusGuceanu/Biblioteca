package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	protected Connection cn;

	public Conector() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/biblioteca";
			cn = (Connection) DriverManager.getConnection(url, "root", "");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void cerrar() throws SQLException {
		cn.close();
	}
	public Connection getCn() {
		return cn;
	}
	public void setCn(Connection cn) {
		this.cn = cn;
	}
	
	
}
