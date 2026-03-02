package EHMS;
import java.sql.*;

public class ConnectionProvider {
	public static Connection getCon()
	{
		try {
			String url="jdbc:mysql://localhost:3306/HealthcareMangaementSystem";
			String uname="root";
			String pass="root123";

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);

			System.out.println("✅ Database Connected Successfully");
			return con;

		}catch(Exception e) {
			e.printStackTrace(); // IMPORTANT
			return null;
		}
	}
}

