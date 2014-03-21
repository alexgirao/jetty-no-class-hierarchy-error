
package com.acme.labs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value="/s01/*", loadOnStartup=1)
public class Servlet01 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/plain");

        PrintWriter out = response.getWriter();
        out.write("hello world!\n\n");

        String contextPath = request.getContextPath();
        String servletPath = request.getServletPath();
        String pathInfo = request.getPathInfo();
        String queryString = request.getQueryString();

        out.write("contextPath: [" + contextPath + "]\n");
        out.write("servletPath: [" + servletPath + "]\n");
        out.write("pathInfo: [" + pathInfo + "]\n");
        out.write("queryString: [" + queryString + "]\n");
    }
}
