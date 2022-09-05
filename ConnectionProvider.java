import java.sql.DriverManager;
import java.sql.Connection;
public class ConnectionProvider {
    private static Connection conn;
    public static Connection getConn()
    {
        try
        {
            if(conn==null)
            {
                //driver class load
                Class.forName("com.mysql.jdbc.Driver");

                //create a connection

                conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return conn;
    }
}
