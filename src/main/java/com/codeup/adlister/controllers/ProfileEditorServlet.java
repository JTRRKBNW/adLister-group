package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProfileEditorServlet", value = "/edit-profile")
public class ProfileEditorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/edit-profile.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String currentEmail = request.getParameter("currentEmail");
        String updatedEmail = request.getParameter("updatedEmail");
        String currentPassword = request.getParameter("currentPassword");
        String updatedPassword = request.getParameter("updatedPassword");
        User user = (User) request.getSession().getAttribute("user");
        long userId = Long.parseLong(request.getParameter("userId"));


    }
}
