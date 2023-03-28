/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This is a singleton class which is being used for making a database connection 
 * @author pc
 */

public class DatabaseConnection {
    
    private static Connection con = null;
     
    static { 
        
        try {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdatabase2", "root","");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() {
        return con;
    }
}
