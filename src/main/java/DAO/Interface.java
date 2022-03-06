/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;

/**
 *
 * @author mab99
 */
public interface Interface <T> {
      public boolean agregar(T t);
    public List<T> listarTodos();
    public void borrar(Long id);
    public boolean actualizar(T t);
}
