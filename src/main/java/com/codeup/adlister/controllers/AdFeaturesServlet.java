package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static java.lang.Integer.parseInt;


@WebServlet(name = "controllers.AdFeaturesServlet", urlPatterns = "/features")
public class AdFeaturesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = parseInt(req.getParameter("id"));
        Ad displayAd = null;

        List<Ad> adList = DaoFactory.getAdsDao().all();
        for(Ad ad: adList){
            if(ad.getId() == id){
                displayAd = ad;

            }
        }
        if (displayAd == null){
            resp.getWriter().println("<h1>Try again, Something went wrong</h1>");
        }
        else{
            req.setAttribute("displayAd", displayAd);
            req.getRequestDispatcher("/WEB-INF/ads/features.jsp").forward(req, resp);
        }


    }
}