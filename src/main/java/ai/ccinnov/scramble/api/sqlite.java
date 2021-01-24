package ai.ccinnov.scramble.api;

import java.rmi.server.ExportException;
import java.sql.*;


public class sqlite {
    public static void main(String args[]){
        Connection c = null;
        try{
            Class.forName("ai.ccinnov.scramble.sqlite");
            c=DriverManager.getConnection("sqlite/idx.db");
        }catch (Exception e){
            System.err.println(e.getClass().getName()+":"+e.getMessage());
            System.exit(-1);
        }
        System.out.println("Opened Database Successfully");
    }
}
