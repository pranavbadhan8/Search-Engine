package com.example.search_engine_acciojob;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class DatabaseConnection {
    String MySQLURL = "jdbc:mysql://localhost:3306/Search_Engine_Acciojob?useSSL=false";
    String DatabaseUsername = "root";
    String DatabasePassword = "Pranav@1007";
     Connection con = null;
             DatabaseConnection() throws SQLException{
              con = getConnection(MySQLURL,DatabaseUsername, DatabasePassword);
              System.out.print("Connection to database is successful");
             }
       public ResultSet executeQuery(String query) throws SQLException{
           Statement statement = con.createStatement();
           ResultSet ans;
           ans = statement.executeQuery(query);
           return ans;
       }
       public int executeUpdate(String query) throws SQLException{
                 int ans = 0;
           Statement statement = con.createStatement();
           ans = statement.executeUpdate(query);
           return ans;
       }

}
