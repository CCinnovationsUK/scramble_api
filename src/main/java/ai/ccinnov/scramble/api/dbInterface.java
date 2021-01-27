package ai.ccinnov.scramble.api;

import java.sql.Statement;
import java.sql.SQLIntegrityConstraintViolationException; //Incorrect SQL Syntax thing

import java.sql.*;

public class dbInterface {
    private static String dbURL = "jdbc:mysql://192.168.1.53:3306/";
    private static String uName = "javaInterface"; private static String password = "javaInterface55@";
    //!TODO Replace simple SSH password authentication with AES256

    private static String benchmarkQuery = "SELECT * FROM scramblesdb.routes;"; //!TODO Make this SELECT 1 FROM

    private Connection connection = null;
    //THIS SHOULD ALMOST CERTAINLY STAY PRIVATE
    private Statement _statement = null;
    //THIS TOO

    void initDbConnection(){
        boolean failedYet = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Remember to include the JAR
        }catch(ClassNotFoundException e){
            System.out.println("\n!!! JDBC JAR Not present / not imported successfully");
            failedYet = true;
        }

        try {
            this.connection = DriverManager.getConnection(dbURL,uName,password); //Establishing connection
            this._statement = connection.createStatement();

        }catch (SQLException e){
            System.out.println("\n!!! SQL Connection Not successful\n\n");
            e.printStackTrace();
            failedYet = true;}

        if(!failedYet){
            System.out.println(">>> Database Connection Successful");
        }
    }

    boolean postCombo(comboPost cp){
        String query = ("INSERT INTO scramblesdb.routes (alias,inbox) VALUES ('"+cp.getAlias()+"', '"+cp.getInbox()+"');");
        try{
            this._statement.execute(query); //This still hasn't updated for some reason

            System.out.println(">>> POST Successful.");
            return true;
        }catch (SQLIntegrityConstraintViolationException e){
            System.out.println("!!! Alias "+cp.getAlias()+" is already in use!");
            //e.printStackTrace();
            return false;}
        catch (Exception e){
            System.out.println("!!! Unknown SQL Query Error");
            e.printStackTrace();
            return false;
        }


    }
    String getCombo(String alias){ // This should never be used in a production model, very unsecure
        String query = ("SELECT * FROM scramblesdb.routes WHERE Alias = '"+alias+"';");
        try{
            ResultSet result = this._statement.executeQuery(query);
            result.next();
            return result.toString();
        }catch (SQLIntegrityConstraintViolationException e){
            System.out.println("!!! Incorrect SQL Syntax!");
            return "-2";
        }catch (Exception e){
            System.out.println("!!! Unknown SQL Query Error!");
            e.printStackTrace();
            return "-1";
        }
    }


    dbInterface(){}//Initialisation


}
