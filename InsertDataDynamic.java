import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;
public class InsertDataDynamic
{
    public static void main(String[] args) {
        try
        {
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection
            String url="jdbc:mysql://localhost:3306/newdb";
            Connection con= DriverManager.getConnection(url,"root","");
            //Create a query
            String q="insert into table1(name,city)values(?,?) ";
            //get the preparedStatement object
            PreparedStatement pstmt=con.prepareStatement(q);

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name :");
            String name=br.readLine();

            System.out.println("Enter City :");
            String city=br.readLine();

            //set the value
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.executeUpdate();
            System.out.println("data inserted");
            if(con.isClosed())
            {
                System.out.println("connection is closed");
            }
            else {
                System.out.println("connection created");
            }
            con.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
