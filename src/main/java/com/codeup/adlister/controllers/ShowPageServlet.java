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

import static com.codeup.adlister.dao.DaoFactory.*;
import static java.lang.Integer.parseInt;

@WebServlet(name = "controllers.DetailsServlet", urlPatterns = "/show")
public class ShowPageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = parseInt(request.getParameter("id"));
        Ad displayAd = null;

        List<Ad> adList = getAdsDao().all();
        for (Ad ad : adList) {
            if (ad.getId() == id) {
                displayAd = ad;
            }
        }
        if (displayAd == null) {
            response.getWriter().println("<h1>Something went wrong, try again</h1>");
        } else {
            User displayUser = DaoFactory.getUsersDao().findUserByID(displayAd.getUserId());
            User user = (User)request.getSession().getAttribute("user");
            if (user.getId() == displayUser.getId()) {
                request.setAttribute("isOwner", true);
            }
            request.setAttribute("displayAd", displayAd);
            request.setAttribute("displayUser", displayUser);
            request.getRequestDispatcher("/WEB-INF/ads/features.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Ad ad = (Ad)request.getAttribute("displayAd");
        List<Ad> deleteAds =DaoFactory.getAdsDao().deleteAd(ad.getId());
        request.setAttribute("delete",deleteAds);
        response.sendRedirect("/profile");
    }
}

