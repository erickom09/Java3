/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T-107
 */
public class ServletAutenticar extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String login=request.getParameter("login");
       String password=request.getParameter("password");
       String ip=request.getRemoteAddr();
       Date fecha= Calendar.getInstance().getTime();
       
       //buscar aqu� el usuario cuyo login u password se proporcionaron
       //una vez buscado verificar su id, supongamos que es 1
       Usuario u1=new Usuario();
                   u1.setIdUsuario(1);
        //despues guarda la sesion con la clase administracion
                   Administracion a=new Administracion();
                   a.setFecha(fecha);
                   a.setIdUsuario(u1);
                   a.setIp(ip);
                   DAOAdministracion daoadmon=new DAOAdministracion();
                   try{
                       daoadmon.guardar(a);
                   }catch(Exception ex){
                   }
       //creamos un model
       Usuario u=new Usuario();
               //Ajustamos su login password
               u.setLogin(login);
               u.setPassword(password);
               //redireccionamos al servlet
               ModeloAutenticar modelo=new ModeloAutenticar();
        //Aqu� se guir�a la capa model donde nos indica si la autenticacion fue exitosa
               if(modelo.autenticar(u)){
        RequestDispatcher despachador=request.getRequestDispatcher("/Bienvenido.jsp");
        despachador.forward(request, response);
              }else{RequestDispatcher despachador=request.getRequestDispatcher("/error.jsp");
        despachador.forward(request, response);
               }
    }
}