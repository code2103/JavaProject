package miniO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author shivam
 */
public class dbConnection {
    public static Connection con(){
    Connection con =null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_orkut","root","");
        //JOptionPane.showMessageDialog(null,"connected");
    }
    catch(HeadlessException | ClassNotFoundException | SQLException e)
    {
        JOptionPane.showMessageDialog(null,e);
    }
    return con;
    }
    
}
