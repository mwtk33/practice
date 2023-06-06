package com.example.test1.mapper;

import com.example.test1.entity.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int addUser(String username,String password);
    User queryUserByUsernameAndPassword(String username,String password);
    User queryUserById(Integer id);
    List<User> queryAllUser();

    int addUser1(String username,String password,String phone,String email);

    List<news> queryAllNews();
    List<mytable> queryAll();
    List<mytable1> queryAll1();
    List<biji> queryAll2();

//    日志部分
    int addrizhi(String img,String a,String span,String a1,String a2,String a3);
    List<rizhi> queryAll3();

    //注册
    int addzhuce(String username,String password);
    //登录
    zhuce getData(String username,String password);
//   饮食健康
    List<health1> queryAll4();
    List<health2> queryAll5();
}
