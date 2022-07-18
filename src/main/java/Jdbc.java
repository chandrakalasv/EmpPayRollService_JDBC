import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
    public static void main(String[] args) {
        System.out.println("employee pay roll service jdbc");
        try {
//            com.mysql.jdbc.Driver;
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://root@localhost:3306/", "root", "Maanvij@123");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("show databases");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


