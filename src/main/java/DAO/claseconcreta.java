/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uv.crud.singleton.ConexionBD;

/**
 *
 * @author mab99
 */
public class claseconcreta implements Interface <pojodepartamentos>{
     private Connection connection;
    private PreparedStatement query;
    private List<pojodepartamentos> ls;
    private pojodepartamentos professor;
    private boolean isSuccesfully = false;
    
    private final String[] QUERIES = {
        "INSERT INTO departamentos (nombre) VALUES (?);",
        "UPDATE departamentos SET nombre = ? WHERE (id = ?);",
        "DELETE FROM departamentos WHERE (id = ?);",
        "SELECT * FROM departamentos;"
    };

    public claseconcreta() {
        connection = ConexionBD.getSingleton().getConnection();
        ls = new ArrayList();
        
    }        

    @Override
    public boolean agregar(pojodepartamentos Pojo) {
        try{
            query = connection.prepareStatement(QUERIES[0]);
            
            query.setString(1, Pojo.getNombre());
            
            System.out.println(query);
            
            return query.execute();            
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public List<pojodepartamentos> listarTodos() {
         try{
            query = connection.prepareStatement(QUERIES[3]);
            
            System.out.println(query);
            
            ResultSet data = query.executeQuery();
            
            System.out.println(data);
            
            while(data.next()){
                pojodepartamentos departamento = new pojodepartamentos();
                departamento.setId(data.getLong("id"));
                departamento.setNombre(data.getString("nombre"));
                ls.add(departamento);
            }           
            
        }catch(SQLException ex){
            Logger.getLogger(pojodepartamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
         
    }

    @Override
    public void borrar(Long id) {
         try{
            query = connection.prepareStatement(QUERIES[2]);
            
            query.setLong(1, id);
            
            System.out.println(query);
            
            query.execute();
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    @Override
    public boolean actualizar(pojodepartamentos Pojo) {
       try{
            query = connection.prepareStatement(QUERIES[1]);
            
            query.setString(1, Pojo.getNombre());
            query.setLong(2, Pojo.getId());
            
            System.out.println(query);
            
            return query.execute();            
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }

    
}
