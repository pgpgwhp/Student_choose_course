package Service;

import Dao.UsersDao;

import java.sql.SQLException;

public class CheckUsersSchoolnumOrEmailService {

    public String checkUsersSchoolnumOrEmailService(String str) throws SQLException {
        UsersDao usersDao = new UsersDao();
        if(usersDao.CheckUserByEmailorSchoolnum(str)){
            return "exited";
        }
        else{
            return "can be use";
        }
    }
}
