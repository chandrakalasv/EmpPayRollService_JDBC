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
                    "jdbc:mysql://root@localhost:3306/payroll_service", "root", "Maanvij@123");
            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE employee_payroll " +
                    "(id int unsigned not null auto_increment, " +
                    " name VARCHAR(255), " +
                    " salary Double, " +
                    " Start_Date date, " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


