package Dao;

import Domain.User;
import jdbc.DbcpUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDao {


    /*
    *
    * 实现数据库的查询功能，通过用户的数据库可以看到，此时school_num是独一无二的的
    *
    * params：schoolnum
    * return boolean
    *
    * */
    public User SelectUserByschoolnum(String school_num){

        Connection conn = null;
        PreparedStatement pstat = null;
        ResultSet res = null;

        try {
            conn = DbcpUtil.getConnection();
            String sql = "select * from user where school_num = ?";
            pstat = conn.prepareStatement(sql);
            pstat.setString(1,school_num);

            res  = pstat.executeQuery();
//            System.out.print(sql);
//            System.out.print("++++++++++++++++++++++++++");
            if(res.next()){

                User user = new User();
                user.setUser_id(res.getInt(1));
                user.setSchool_num(res.getString(2));
                user.setName(res.getString(3));
                user.setSex(res.getString(4));
                user.setGrade(res.getString(5));
                user.setSchool(res.getString(6));
                user.setMajor(res.getString(7));
                user.setClass_(res.getString(8));
                user.setQq(res.getString(9));
                user.setPhone(res.getString(10));
                user.setEmail(res.getString(11));
                user.setPassword(res.getString(12));
                user.setAdress(res.getString(13));
                user.setRole(res.getInt(14));
//                System.out.print("======================================================");
//                System.out.println(user.getSchool_num());
//                System.out.println(user.getPassword());

                return user;

            }
            else{
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
