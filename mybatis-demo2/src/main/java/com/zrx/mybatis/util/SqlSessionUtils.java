package com.zrx.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtils {

    public static SqlSession getSqlSession(boolean b){
        SqlSession sqlSession=null;
        try {
            InputStream io = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder= new SqlSessionFactoryBuilder();
            SqlSessionFactory build = sqlSessionFactoryBuilder.build(io);
            sqlSession = build.openSession(b);
            return sqlSession;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }
}
