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

@WebServlet(name = "controllers.AdFeaturesServlet", urlPatterns = "/features")
public class AdFeaturesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String adId = req.getParameter("ad_id");
        long Id = Long.parseLong(adId);
        req.setAttribute("displayAd", getAdsDao().byAdID(Id));
        req.getRequestDispatcher("/WEB-INF/features.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id = parseInt(request.getParameter("adID"));
        System.out.println(id);
        System.out.println(id);
//        DaoFactory.getAdsDao().deleteByID(id);
        response.sendRedirect("/confirmdelete");
    }
}