/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sqltrial;
import java.sql.*;
/**
 *
 * @author saurabh0719
 */
public class sqltrialclass {
    private static final String url = "jdbc:mysql://localhost/bedrock";
    private static final String user = "root";
    private static final String password = "ggmufc0719";
        
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        Statement stmt = null;
        try {
                Connection con = DriverManager.getConnection(url, user, password);
                System.out.println("Success");
                stmt = con.createStatement();
                String sql = "INSERT INTO student " + "VALUES (20900, 'Abhinab', '1999-09-16', 'CSE', 'Bhubaneshwar')";
                stmt.executeUpdate(sql);

        } catch (Exception e) {
                e.printStackTrace();
        }        
        
    }
    
}
