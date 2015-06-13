/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T-107
 */
public class DAOUsuario {
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
     static {
        factory= HibernateUtilidades.getSessionFactory();
        session= factory.openSession();
        tranza= session.beginTransaction();
    }
    public static void cerrarTodo(){
        tranza.commit();
        session.close();
}
//sirve para inicializar la secion
    public DAOUsuario(){
        
    }
    //Creamos el insert
    public void guardar(Usuario u)throws Exception{
        //abrirTodo();
        session.save(u);
        cerrarTodo();
    }
    //creamos el update
    public void actualizar(Usuario u)throws Exception{
          session.update(u);
        cerrarTodo();
    }
    //creamos el buscar todos
    public List<Usuario> buscarTodos()throws Exception{
        return null;
    }
    //Creamos el buscarPorId
     public Usuario buscarPorId(Integer id)throws Exception{
        return null;
    }
     //Creamos el de autenticar
     public boolean autenticar(Usuario u)throws Exception{
         return false;
     }
}

    

