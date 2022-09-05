import java.sql.*;
public class FirstJDBC {
    public static void main(String[] args) {
        try {
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection
            String url="jdbc:mysql://localhost:3306/newdb";
            Connection con=DriverManager.getConnection(url,"root","");
            if(con.isClosed())
            {
                System.out.println("connection is closed");
            }
            else {
                System.out.println("connection created");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
