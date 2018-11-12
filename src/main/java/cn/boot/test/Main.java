package cn.boot.test;

import cn.boot.bean.User;
import cn.boot.config.SpringConfig;
import cn.boot.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public  static void main(String[] args){
        //通过java类配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        //在Spring容器中获取Bean对象
        UserService userService = context.getBean(UserService.class);

       /* List<User> users = userService.getAllUser();

        for (User temp: users){
            System.out.println(temp.getName() + temp.getAge());
        }*/
        try {
            userService.testConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //销毁容器
        context.registerShutdownHook();
    }
}
