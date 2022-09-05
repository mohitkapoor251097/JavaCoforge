import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateData {
    public static void main(String[] args) {
        try
        {
            Connection con=ConnectionProvider.getConn();
            String q="update table1 set name=?,city=? where id=?";
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter New Name");
            String name=br.readLine();
            System.out.println("Enter New City");
            String city=br.readLine();
            System.out.println("Enter Student Id");
            int id=Integer.parseInt(br.readLine());
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.setInt(3,id);
            pstmt.executeUpdate();
            System.out.println("done");
            con.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
