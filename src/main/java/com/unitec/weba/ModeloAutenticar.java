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
public class ModeloAutenticar {
   public boolean autenticar(Usuario u){
       boolean autenticado=false;
       //Autenticamos sin base datos
       if(u.getLogin().equals("campos")&&u.getPassword().equals("campos")){
           autenticado=true;
       }
return  autenticado;
   }
}
