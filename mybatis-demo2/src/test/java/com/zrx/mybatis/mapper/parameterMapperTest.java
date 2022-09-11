package com.zrx.mybatis.mapper;

import com.zrx.mybatis.pojo.User;
import com.zrx.mybatis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class parameterMapperTest {
    @Test
    public void TestGetAllUsers() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        parameterMapper mapper = sqlSession.getMapper(parameterMapper.class);
        List<User> allUsers = mapper.getAllUsers();
        for (User allUser : allUsers) {
            System.out.println(allUser);
        }

    }
    @Test
    public void addUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        parameterMapper mapper = sqlSession.getMapper(parameterMapper.class);
        int i = mapper.InsertToUser(new User(null, "李四", "123456", 18, "男", "12396345@qq.com"));
        System.out.println(i);

    }

    @Test
    public void getUserByUsernameAndPassword(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        parameterMapper mapper = sqlSession.getMapper(parameterMapper.class);
        User user = mapper.gerUserByUsernameAndPassword("张三", "123456");
        System.out.println(user);
    }
}
