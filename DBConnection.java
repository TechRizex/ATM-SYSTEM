/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_machine;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Shiv Singh
 */
public class DBConnection {
   
    public static Connection getConnection(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
              String url="jdbc:oracle:thin:@//localhost:1521/XEPDB1";
               Connection con=DriverManager.getConnection(url,"system","rahul123");
            return con;
            
        }catch (ClassNotFoundException | SQLException e){
        }
        return null;
       
    }
    
}
