/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.uv.crud.main;

import DAO.Interface;
import DAO.claseconcreta;
import DAO.pojodepartamentos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mab99
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interface claseconcreta = new claseconcreta();
//          Interface daoEmpleados = new DaoEmpleados();
        
        List<pojodepartamentos> ls = new ArrayList<>();
        
       pojodepartamentos pojoDepartamento = new pojodepartamentos();
       pojoDepartamento.setId(Long.valueOf(1));
        pojoDepartamento.setNombre("Sistemas");
//        PojoEmpleados pojoEmpleados = new PojoEmpleados();
//        pojoEmpleados.setFullname("Eduardo");
//        pojoEmpleados.setAddres("laloca");
//        pojoEmpleados.setIdDept(Long.valueOf(1));
//        pojoEmpleados.setId(Long.valueOf(1));
        
       claseconcreta.agregar(pojoDepartamento);
//        daoEmpleados.agregar(pojoEmpleados);
        
        
//        claseconcreta.actualizar(pojoDepartamento);
//        daoEmpleados.actualizar(pojoEmpleados);
//        ls = claseconcreta.listarTodos();
//        for(pojodepartamentos departamento : ls){
//            System.out.println(departamento.getNombre());
//        }
//        daoDepartamento.borrar(Long.valueOf(1));
//          daoEmpleados.borrar(Long.valueOf(1));
    }
    
    }
    

