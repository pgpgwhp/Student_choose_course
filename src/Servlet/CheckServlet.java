package Servlet;

import Service.CheckUsersSchoolnumOrEmailService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "CheckServlet")
public class CheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String school_num = request.getParameter("shcoolnum");
        String email = request.getParameter("email");

        CheckUsersSchoolnumOrEmailService checkUsersSchoolnumOrEmailService = new CheckUsersSchoolnumOrEmailService();
        response.setContentType("text/html, charset=utf-8");
        String res = null;
        try {
            if(school_num != null){
                res = checkUsersSchoolnumOrEmailService.checkUsersSchoolnumOrEmailService(school_num);
                PrintWriter out = response.getWriter();
                out.print(res);
            }
            if(email != null){
                res = checkUsersSchoolnumOrEmailService.checkUsersSchoolnumOrEmailService(email);
                PrintWriter out = response.getWriter();
                out.print(res);
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }


    }
}
