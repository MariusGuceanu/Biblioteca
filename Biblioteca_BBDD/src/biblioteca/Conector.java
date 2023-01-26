package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conector {
	protected Connection cn;

	public void Conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/biblioteca";
			cn = (Connection) DriverManager.getConnection(url, "root", "");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
