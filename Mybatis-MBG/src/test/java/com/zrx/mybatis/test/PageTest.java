package com.zrx.mybatis.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zrx.mybatis.bean.Emp;
import com.zrx.mybatis.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PageTest {
    @Test
    public void TestPage() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        PageHelper.startPage(1,2);
        List<Emp> emps = mapper.selectByExample(null);
        for (Emp emp : emps) {
            System.out.println(emp);
        }

        PageInfo<Emp> pageInfo=new PageInfo<Emp>(emps,5);
        System.out.println(pageInfo);
    }
}
