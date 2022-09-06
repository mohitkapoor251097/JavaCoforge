import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public static boolean insertStudentToDb(Student st)
    {
        boolean f=false;
        try
        {
            Connection con=ConnectionProvider.getConn();
            String q="insert into table1(name,city)values(?,?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1,st.getNane());
            pstmt.setString(2,st.getCity());

            pstmt.executeUpdate();
            f=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return  f;
    }

    public static boolean deleteStudent(int userId) {
        boolean f=false;
        try
        {
            Connection con=ConnectionProvider.getConn();
            String q="delete from table1 where id=?";
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setInt(1,userId);


            pstmt.executeUpdate();
            f=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return  f;

    }

    public static boolean showAllStudent() {
        boolean f=false;
        try
        {
            Connection con=ConnectionProvider.getConn();
            String q="select * from table1";

            Statement stmt= con.createStatement();

          ResultSet set=  stmt.executeQuery(q);
            while(set.next())
            { int id=set.getInt(1);
                String name=set.getString(2);
                String city=set.getString(3);
                System.out.println("id"+ id +" "+ name+ " "+city);
                System.out.println("====================================");
            }




        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return  f;
    }
}
