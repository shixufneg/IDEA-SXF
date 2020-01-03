package demotest;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/b")
public class BServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        Object sxf = servletContext.getAttribute("sxf");
        System.out.println(sxf);
        Object sxf1 = servletContext.getAttribute("sxf1");
        System.out.println(sxf1);
        Object sxf2 = servletContext.getAttribute("sxf2");
        System.out.println(sxf2);
        Object sxf3 = servletContext.getAttribute("sxf3");
        System.out.println(sxf3);
    }
}
