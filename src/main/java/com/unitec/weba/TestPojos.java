/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

/**
 *
 * @author T-107
 */
public class TestPojos {

  
     public static void main(String[] args)throws Exception{
       
        //System.out.println("Probaremos todas las operaciones sql");
        Usuario u=new Usuario();
        u.setEmail("lli-el@hotmail");
        //u.setIdUsuario(3);
        u.setNombre("Gerardo");
        u.setLogin("gerardo");
        u.setPassword("getagripmothafoca");
        
     DAOUsuario daou=new DAOUsuario();
     daou.guardar(u);
     //daou.actualizar(u);
        
     
        
    }
    
}
