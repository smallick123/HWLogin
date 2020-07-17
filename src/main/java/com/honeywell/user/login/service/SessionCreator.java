package com.honeywell.user.login.service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

class SessionCreator extends HttpServlet {
    private static final long serialVersionUID = -881190270020485083L;

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Get the session if exists or create a new one.
        HttpSession session = request.getSession(true);

        // Set session attributes
        session.setAttribute("username", username);
        session.setAttribute("password", password);

        try {
            response.setContentType("text/html");
            response.setStatus(200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
