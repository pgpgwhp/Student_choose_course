package Service;

import Dao.UsersDao;
import Domain.User;

import java.sql.SQLException;

public class RegistService {

    public void InserRegister(User user) throws SQLException {

        UsersDao usersDao = new UsersDao();
        usersDao.InserUser(user);
    }
}
