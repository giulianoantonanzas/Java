package accesoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConexion {

	public static Connection getConexion() {

		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/Examen_Parcial_2";

			String usuario = "root";

			String contrasenia = "";

			con = DriverManager.getConnection(url, usuario, contrasenia);

		} catch (ClassNotFoundException e) {
			System.out.println(e);

		} catch (SQLException e) {

			System.out.println(e);

		}

		return con;

	}

}
