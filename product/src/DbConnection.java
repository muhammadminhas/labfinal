
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bse191002
 */
public class DbConnection {
    Connection con;
    public DbConnection()
    {
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/store","root","");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insert(String query)
    {
        int row=0;
        try {
            //through statement object we pass our query
            Statement stmt=con.createStatement();
            
            //doing insertion in the database
            row=stmt.executeUpdate(query);
            System.out.println(row+" number of rows affected");
            
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void update(String query)
    {
        int row=0;
        try {
            //through statement object we pass our query
            Statement stmt=con.createStatement();
            
            //doing insertion in the database
            row=stmt.executeUpdate(query);
            System.out.println(row+" number of rows affected");
            
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void delete(String query)
    {
        int row=0;
        try {
            //through statement object we pass our query
            Statement stmt=con.createStatement();
            
            //doing insertion in the database
            row=stmt.executeUpdate(query);
            System.out.println(row+" number of rows affected");
            
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
