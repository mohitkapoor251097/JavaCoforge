package com.data;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class imageSave {
    public static void main(String[] args) {
        try {
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection
            String url="jdbc:mysql://localhost:3306/newdb";
            Connection con=DriverManager.getConnection(url,"root","");

            String q="insert into images(pic) values(?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            FileInputStream fis=new FileInputStream("src/test/java/com/data/usecase.PNG");
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("images insert");
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
