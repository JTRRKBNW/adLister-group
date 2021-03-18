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
        String adId = req.getParameter("user_id");
        long Id = Long.parseLong(adId);
        req.setAttribute("ad", DaoFactory.getAdsDao().individualAd(Id));
        req.getRequestDispatcher("/WEB-INF/profile.jsp").forward(req, resp);
    }
}
