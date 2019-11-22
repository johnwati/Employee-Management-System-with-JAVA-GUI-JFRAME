import java.sql.*;
import javax.swing.*;
public class sqliteConnection {
	Connection con = null;
	public static Connection dbConnector(){
		try{
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Dina Chanthan\\Desktop\\Java Project\\EmployeeData.sqlite");
			//JOptionPane.showMessageDialog(null, "Connection Successful!");
			return con;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
		return null;
	}
}
