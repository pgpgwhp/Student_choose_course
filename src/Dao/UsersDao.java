package Dao;

import Domain.User;
import jdbc.DbcpUtil;
import jdbc.JDBCUTIL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDao {


    /*
    * 向数据库中插入数据，实现注册功能
    *
    *
    * */
    public void InserUser(User user) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;
        String sql = "INSERT INTO user(school_num,name,sex,grade,school,major,class,qq,phone,email,password,adress,role) VALUES \n" +
                "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        conn = DbcpUtil.getConnection();
        pstat = conn.prepareStatement(sql);
        pstat.setString(1, user.getSchool_num());
        pstat.setString(2,user.getName());
        pstat.setString(3, user.getSex());
        pstat.setString(4, user.getGrade());
        pstat.setString(5, user.getSchool());
        pstat.setString(6, user.getMajor());
        pstat.setString(7, user.getClass_());
        pstat.setString(8, user.getQq());
        pstat.setString(9, user.getPhone());
        pstat.setString(10, user.getEmail());
        pstat.setString(11, user.getPassword());
        pstat.setString(12, user.getAdress());
        pstat.setInt(13, user.getRole());

        int num = pstat.executeUpdate();
//        System.out.println(num);

        JDBCUTIL.closeDb(pstat, null);
        DbcpUtil.closeConnection(conn);





    }


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



    /*
    *
    *
    * 根据学号或者邮箱查询当前该学号或者邮箱是否被注册过
    * */
    public Boolean CheckUserByEmailorSchoolnum(String str) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;
        ResultSet res = null;
        boolean isexits = false;

        conn = DbcpUtil.getConnection();
        String sql = "select * from user where email = ? or school_num = ?";

        pstat = conn.prepareStatement(sql);
        pstat.setString(1,str);
        pstat.setString(2,str);
        res = pstat.executeQuery();

        if(res.next()){
            isexits = true;

        }

        JDBCUTIL.closeDb(pstat, res);
        DbcpUtil.closeConnection(conn);

        return isexits;
    }
}
