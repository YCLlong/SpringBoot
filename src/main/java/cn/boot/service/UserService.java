package cn.boot.service;

import cn.boot.bean.User;
import cn.boot.dao.UserDao;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Service //该注解被Spring扫描后会被加入到Spring容器中
public class UserService {
    //注入UserDao
    @Autowired
    private UserDao userDao;

    //注入连接池
    @Autowired
    private DruidDataSource dataSource;

    //service层，返回所有的用户
    public List<User> getAllUser(){
        return userDao.getAllUser();
    }

    //测试数据库连接
    public void testConnection() throws SQLException {
        Connection connection = null;
        connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        String sql = "select * from powerdata";
        ResultSet resultSet =  statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1));
        }
        connection.close();
    }

}
