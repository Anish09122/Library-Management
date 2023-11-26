
 
/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

public class connectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","anish@15083");
            return con;
        }
       catch(Exception e){
           System.out.println(e);
            return null;

       }
    }
}
