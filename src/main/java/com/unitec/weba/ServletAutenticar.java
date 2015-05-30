/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.io.IOException;
import java.io.PrintWriter;
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
       //creamos un model
       Usuario u=new Usuario();
               //Ajustamos su login password
               u.setLogin(login);
               u.setPassword(password);
               //redireccionamos al servlet
               ModeloAutenticar modelo=new ModeloAutenticar();
        //Aquí se guiría la capa model donde nos indica si la autenticacion fue exitosa
               if(modelo.autenticar(u)){
        RequestDispatcher despachador=request.getRequestDispatcher("/Bienvenido.jsp");
        despachador.forward(request, response);
              }else{RequestDispatcher despachador=request.getRequestDispatcher("/error.jsp");
        despachador.forward(request, response);
               }
    }
}