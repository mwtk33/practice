package com.example.test1.controller;

import com.example.test1.entity.*;
import com.example.test1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/MyController1")
@CrossOrigin
public class MyController1 {
    private UserMapper userMapper;

    @Autowired
    public MyController1(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @RequestMapping("/test1")
    public int test1(String username,String password){
        int result = userMapper.addUser(username,password);
        return result;
    }

    @RequestMapping("/test2")
    public int test2(String username,String password){
        int i;
        User user = userMapper.queryUserByUsernameAndPassword(username,password);
        if (user==null){
            user = new User();
            user.setId(0);
            user.setUsername("null");
            user.setPassword("null");
            i=0;
        }else {
            i=1;
        }
        return i;

    }

    @RequestMapping("/test3")
    public User test3(Integer id){
        User user = userMapper.queryUserById(id);
        if (user==null){
            user = new User();
            user.setId(0);
            user.setUsername("null");
            user.setPassword("null");
        }
        return user;
    }

    @RequestMapping("/test4")
    public List<User> test4(){
        List<User> list = userMapper.queryAllUser();

//        for (int i=0;i<list.size();i++){
//            User user = list.get(i);
//            String name = user.getUsername();
//            String pwd = user.getPassword();
//            System.out.println(name);
//            System.out.println(pwd);
//        }

        return list;
    }


    @RequestMapping("/test5")
    public int test5(String username,String password,String phone,String email){
        int result1 = userMapper.addUser1(username,password,phone,email);
        return result1;
    }


    @RequestMapping("/test6")
    public List<news> test6(){
        List<news> list = userMapper.queryAllNews();
        return list;

    }

    //前端图片

    @RequestMapping("/test7")
    public List<mytable> test7(){
    List<mytable> list = userMapper.queryAll();
    return list;
    }

    @RequestMapping("/test8")
    public List<mytable1> test8(){
        List<mytable1> list = userMapper.queryAll1();
        return list;
    }

    @RequestMapping("/test9")
    public List<biji> test9(){
        List<biji> list = userMapper.queryAll2();
        return list;
    }

    //日志部分
    @RequestMapping("/test10")
    public int test10(String img,String a,String span,String a1,String a2,String a3){
        int res = userMapper.addrizhi(img,a,span,a1,a2,a3);
        return res;
    }

    @RequestMapping("/test11")
    public List<rizhi> test11(){
        List<rizhi> list = userMapper.queryAll3();
        return list;
    }

    @RequestMapping("/test12")
    public int test12(String username,String password){
        int result = userMapper.addzhuce(username,password);
        return result;
    }

    @RequestMapping("/test13")
    public int test13(String username,String password){
        int b;
        zhuce d = userMapper.getData(username,password);
        if (d==null){
            d=new zhuce();
            d.setPassword("null");
            d.setUsername("null");
            b=0;

        }else {
            b=1;
        }
        return b;

    }

    @RequestMapping("/test15")
    public List<health1> test15(){
        List<health1> list = userMapper.queryAll4();
        return list;
    }

    @RequestMapping("/test16")
    public List<health2> test16(){
        List<health2> list = userMapper.queryAll5();
        return list;
    }


}
