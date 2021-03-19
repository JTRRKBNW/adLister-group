package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "updateAdServlet", value = "/updateAdServlet")
public class updateAdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long Update= Long.parseLong(request.getParameter("Id"));
        String upTitle=request.getParameter("title");
        String upDescr=request.getParameter("descript");
        DaoFactory.getAdsDao().updateAd(Update,upTitle,upDescr);
        System.out.println(Update);
        response.sendRedirect("/ads");
    }
}
