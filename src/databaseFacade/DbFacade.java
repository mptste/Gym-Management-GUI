/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseFacade;
import databaseConnection.DatabaseConnection;
import java.awt.HeadlessException;
import java.sql.*;
import java.sql.ResultSet;

/**
 * This class represent Facade pattern which encapsulates 
 * communication methods to work with databases
 * @author pc
 */

public class DbFacade extends DatabaseConnection {
        
    public static boolean loginUser(String userName, String password, String userType) {
        try {
            String query = "SELECT * FROM logintable WHERE username = ? AND password = ? and usertype = ?";
            PreparedStatement pst = DatabaseConnection.getConnection().prepareStatement(query);

            pst.setString(1, userName);
            pst.setString(2, password);
            pst.setString(3, userType);

            ResultSet rs = pst.executeQuery();
            return rs.next();
        } catch (HeadlessException | SQLException e) {
            return false;
        }
    }

}



 
   



   
    
      
    
    
    

    
    
    

    
    


    

