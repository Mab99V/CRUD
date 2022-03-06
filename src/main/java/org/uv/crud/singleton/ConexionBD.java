/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.crud.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mab99
 */
public class ConexionBD {
    private static ConexionBD conexionInstancia = null;
    private Connection connection = null;
    private final String URL = "jdbc:postgresql://localhost:5432/crud";
    private final String USUARIO = "postgres";
    private final String CONTRASENIA = "postgres";

    private ConexionBD() {
        try{
            connection = DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
            System.out.println("No eres tan inútil");
        } catch(SQLException e){
            System.out.println(e);
            System.out.println("Uy no, ¿sabes qué? Cambiate de carrera");
        } 
    }
        
    public static ConexionBD getSingleton(){
        if(conexionInstancia == null)
            conexionInstancia = new ConexionBD();
        
        return conexionInstancia;
    }   
    
    public Connection getConnection(){
        return connection;
    }
   
}
