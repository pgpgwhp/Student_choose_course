package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUTIL {
    public static void closeDb(Statement stat, ResultSet res){
        try {
            if (res!=null){
                res.close();
            }

            if(stat != null){
                stat.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
