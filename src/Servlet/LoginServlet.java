package Servlet;

import Dao.UsersDao;
import Domain.User;
import Service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String school_num = request.getParameter("school_num");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();

        LoginService loginService = new LoginService();

        User user = new User();
//        System.out.println(password);
//        System.out.println(school_num);

        try {
            user = loginService.isLogin(school_num, password);
//            System.out.println("+++++++");
//            System.out.println(user.getSchool_num());
//            System.out.println(user.getPassword());

            if(user != null){

                session.setAttribute("user",user);
                if(user.getRole() == 1){request.getRequestDispatcher("/teacher.jsp").forward(request, response);}
                if(user.getRole() == 2){request.getRequestDispatcher("/student.jsp").forward(request, response);}
                else if(user.getRole()==0){request.getRequestDispatcher("/admin.jsp").forward(request, response);}

            }
            else{
                request.setAttribute("errMsg","错误的学号或密码！");
                request.setAttribute("username",school_num);
                request.setAttribute("password",password);
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
        } catch (ServletException e) {
            e.printStackTrace();
        }


    }
}
