/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.aueb.ecrf;

/**
 *
 * @author Midas
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.persistence.EntityManager;

public class DataConnect {
 
    public static Connection getConnection() {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            javax.naming.InitialContext ctx = new javax.naming.InitialContext();
            javax.sql.DataSource ds = (javax.sql.DataSource)ctx.lookup("ecrf__pm");
            Connection con = ds.getConnection();
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecrf", "root", "1nv1nc1bl3");
            
            return con;
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error -->"
                    + ex.getMessage());
            return null;
        }
    }
 
    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
}