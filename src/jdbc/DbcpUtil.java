package jdbc;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

// 使用DBCP连接池的工具类
// 提供了获取连接的方法,也就是从连接池中获取到活动的连接
// 提供了关闭连接的方法,从连接池中获取到的连接,我们执行关闭之后,这个连接会被返回到连接池中

public class DbcpUtil {

    private static DataSource ds = null;

    static {
        Properties pro = new Properties();

        // 这种方式是获取src下面的文件的
        // InputStream in =
        // JdbcUtil.class.getClassLoader().getResourceAsStream("db.txt");

        // 这种方式是获取字节码所在位置的文件的
        InputStream in = DbcpUtil.class.getResourceAsStream("dbcp.properties");
        try {
            pro.load(in);
            ds = BasicDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        if (ds != null) {
            // 从连接池中获取连接
            conn = ds.getConnection();
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
