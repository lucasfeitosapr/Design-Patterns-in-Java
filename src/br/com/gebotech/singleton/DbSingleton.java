package br.com.gebotech.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    //Volatile will guarantee it will be thread safe.
    private static volatile DbSingleton instance = null;
    private static volatile Connection conn = null;


    //Private constructor so can't create new instance.
    private DbSingleton() {

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create.");
        }
    }

    public static DbSingleton getInstance() {

        //Lazy loading
        if(instance == null) {
            synchronized (DbSingleton.class){
                //it should only run if we're doing for the first time.
                if(instance == null){
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }


    //Not static by design
    public Connection getConnection(){
        if(conn == null) {
            synchronized (DbSingleton.class) {
                if(conn == null){
                    try {

                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

                        conn = DriverManager.getConnection(dbUrl);

                    } catch (SQLException e) {

                        e.printStackTrace();

                    }
                }
            }
        }

        return conn;
    }
}
