import java.sql.*;

import javax.swing.*;

public class DBConnect {
	Connection con;
	public static Connection DB() {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizgame", "root" ,"");
			return con;
		}catch(Exception e) {
			 JOptionPane.showMessageDialog(null,e);
			return null;
			
		}
		
	}
}
