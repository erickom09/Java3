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
public class ServletGuardarUsuario extends HttpServlet {
    private Object daspachador;

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       Usuario u=new Usuario();
        
        u.setNombre(request.getParameter("nombre"));
        u.setEmail(request.getParameter("email"));
        u.setLogin(request.getParameter("login"));
        u.setPassword(request.getParameter("password"));
        DAOUsuario dao=new DAOUsuario();
        try{
            dao.guardar(u);
            RequestDispatcher despachador =request.getRequestDispatcher("/respuesta.jsp");
            despachador.forward(request, response);
        }catch(Exception ex){
            
        }
    }

}
