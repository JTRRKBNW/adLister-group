package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "controllers.ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
            return;
        }

        if (request.getParameter("user_id") != null) {
            String username = request.getParameter("user_id");
            User user = DaoFactory.getUsersDao().findByUsername(username);
            request.setAttribute("userAds", DaoFactory.getAdsDao().getAdsByUser(user.getId()));
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        } else {
            User user = (User) request.getSession().getAttribute("user");
            request.setAttribute("userAds", DaoFactory.getAdsDao().getAdsByUser(user.getId()));
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User userDeleteAd = (User) request.getSession().getAttribute("id");
        long adId= Long.parseLong(request.getParameter("adId"));

        DaoFactory.getAdsDao().deleteAd(adId);
        System.out.println(adId);
        response.sendRedirect("/ads");
    }
}
