package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteAdServlet", value = "/ads/delete")
public class DeleteAdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean notLoggedIn = request.getSession().getAttribute("user") == null;

        if (notLoggedIn) {
            response.sendRedirect("/register");
        } else {

            request.getRequestDispatcher("/WEB-INF/ads/delete.jsp")
                    .forward(request, response);
        }


    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User userdeleteAd = (User) request.getSession().getAttribute("user");

        Ad ad = new Ad(
                userdeleteAd.getId(), // this is, now, dynamic..
                request.getParameter("title"),
                request.getParameter("description")
        );
        DaoFactory.getAdsDao().insert(ad);
        response.sendRedirect("/ads");
    }
}
