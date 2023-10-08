package com.sanmigueltech.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private DatabaseConnection() {

    }

    public void connectToDatabase() {
        String server = "parking-database.clfq84ufi7ku.us-east-1.rds.amazonaws.com";
        String port = "3306"; 
        String database = "parking";
        String userName = "admin";
        String password = "Parking-DATABASE";
        
        try {
            // Cargar el controlador JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer la conexión a la base de datos de RDS AWS
            connection = DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database, userName, password);
            System.out.println("Conexion exitosa a la base de datos RDS de AWS.");
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el controlador MySQL: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error al conectarse a la base de datos: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}


