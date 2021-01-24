package ai.ccinnov.scramble.api;

import java.sql.Statement;
import java.sql.SQLIntegrityConstraintViolationException; //Incorrect SQL Syntax thing

import java.sql.*;

public class dbInterface {
    private static String dbURL = "jdbc:mysql://192.168.1.53:3306/";
    private static String uName = "javaInterface"; private static String password = "javaInterface55@";
    //!TODO Replace simple SSH password authentication with AES256

    private static String benchmarkQuery = "SELECT * FROM scramblesdb.routes;"; //!TODO Make this SELECT 1 FROM

    public void initDbConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Remember to include the JAR
        }catch(ClassNotFoundException e){
            System.out.println("\n!!! JDBC JAR Not present / imported successfully");
        }

        try {
            Connection connection = DriverManager.getConnection(dbURL,uName,password); //Establishing connection
            Statement statement=connection.createStatement();
            connection.close();
        }catch (SQLException e){
            System.out.println("\n!!! SQL Connection Not successful\n\n");
            e.printStackTrace();}
    }




    dbInterface(){}//Initialisation

}
