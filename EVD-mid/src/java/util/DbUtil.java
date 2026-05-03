/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DbUtil {
    private static Connection c = null;
    private static String url = "jdbc:mysql://localhost:3306/jsp";
    private static String user = "root";
    private static String password = "1234";
    private static String driver = "com.mysql.cj.jdbc.Driver";

    public static Connection getCon() {

        try {
            Class.forName(driver);
            c = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(DbUtil.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return c;
    
    }
    
}
