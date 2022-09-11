package com.zrx.mybatis.mapper;

import com.zrx.mybatis.pojo.User;
import com.zrx.mybatis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SQLMapperTest {
    @Test
    public void TestGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> userByLike = mapper.getUserByLike("张三");
        System.out.println(userByLike);
    }

    @Test
    public void TestDeleteById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        int i = mapper.deleteUserById("1,2,3");
        System.out.println(i);
    }

    @Test
    public void TestInsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User(null, "王五", "123", 23, "男", "123456@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }
}
