package Servlet;

import Domain.User;
import Service.RegistService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "RegistServlet")
public class RegistServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String school_num = request.getParameter("school_num");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String grade = request.getParameter("grade");
        String school = request.getParameter("school");
        String major = request.getParameter("major");
        String class_ = request.getParameter("class_");
        String qq = request.getParameter("qq");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String adress = request.getParameter("adress");
        String role = request.getParameter("role");
//        System.out.println(request.getParameter("school_num"));
//        System.out.println(request.getParameter("name"));
//        System.out.println(request.getParameter("sex"));
//        System.out.println(request.getParameter("grade"));
////        System.out.println(request.getParameter("grade"));
//        System.out.println(request.getParameter("school"));
//        System.out.println(request.getParameter("major"));
//        System.out.println(request.getParameter("class_"));
//        System.out.println(request.getParameter("qq"));
//        System.out.println(request.getParameter("phone"));
//        System.out.println(request.getParameter("email"));
//        System.out.println(request.getParameter("password"));
//        System.out.println(request.getParameter("adress"));
//        System.out.println(request.getParameter("role"));





        User user = new User();
        user.setSchool_num(school_num);
        user.setName(name);
        user.setSex(sex);
        user.setGrade(grade);
        user.setSchool(school);
        user.setMajor(major);
        user.setClass_(class_);
        user.setQq(qq);
        user.setPhone(phone);
        user.setEmail(email);
        user.setPassword(password);
        user.setAdress(adress);
        user.setRole(Integer.parseInt(role));
        RegistService registService = new RegistService();
        try{
            HttpSession session = request.getSession();
            registService.InserRegister(user);
            request.getRequestDispatcher("/index.jsp").forward(request,response);



        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
