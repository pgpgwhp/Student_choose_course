package Service;
import Dao.UsersDao;
import Domain.User;

public class LoginService {


    public User isLogin(String school_num, String password){

        UsersDao usersdao = new UsersDao();
        User user = usersdao.SelectUserByschoolnum(school_num);
//        System.out.println("+++++++++++++++++++++++++++++");
//        System.out.println(user.getSchool_num());
//        System.out.println(user.getPassword());

        if(user != null){

            if(user.getPassword().equals(password)){
                return user;
            }
            else{
                return null;
            }


        }
        else{
            return null;
        }

    }

}
