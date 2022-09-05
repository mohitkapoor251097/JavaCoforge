import java.sql.*;
public class InsertJDBC {
    public static void main(String[] args) {
        try {
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection
            String url="jdbc:mysql://localhost:3306/newdb";
            Connection con=DriverManager.getConnection(url,"root","");

            //create a query
            String q="create table table1(id int(20) primary key auto_increment,name varchar(200) not null,city varchar(400))";
            //create statement
           Statement stmt =con.createStatement();
           stmt.executeUpdate(q);
            System.out.println("Table Created");
            con.close();

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
