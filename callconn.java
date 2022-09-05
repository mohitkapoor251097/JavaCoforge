import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class callconn {
    public static void main(String[] args) {
        try
        {
            Connection c=ConnectionProvider.getConn();
            String q="insert into images(pic)values(?)";
            PreparedStatement pstmt=c.prepareStatement(q);
            //FileInputStream fis=new FileInputStream("usecase.PNG");
            JFileChooser j=new JFileChooser();
            j.showOpenDialog(null);
            File file=j.getSelectedFile();
            FileInputStream fis=new FileInputStream(file);
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("Done");
            JOptionPane.showMessageDialog(null,"Done");






        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
