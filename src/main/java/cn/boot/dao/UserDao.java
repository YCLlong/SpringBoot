package cn.boot.dao;

import cn.boot.bean.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    //模拟数据库返回User
    public List<User> getAllUser(){
        List<User> userList = new ArrayList<User>();
        for(int i=0; i <10; i++){
            User user = new User();
            user.setName("user" + i);
            user.setPwd("pwd" + i);
            user.setAge(i);
            userList.add(user);
        }
        return  userList;
    }


}
