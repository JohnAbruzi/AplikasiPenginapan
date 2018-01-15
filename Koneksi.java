/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipenginapan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Saridah
 */
public class Koneksi {
    public static Connection getConnection(){
        Connection con=null;
        String username = "root";
        String pass = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aplikasi_penginapan",username,pass);
            System.out.println("Connected to Database");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e); 
        }
        return con;
    }
    
}
