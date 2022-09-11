package com.zrx.mybatis.test;

import com.zrx.mybatis.mapper.DeptMapper;
import com.zrx.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeptMapperTest {

    @Test
    public void countByExample() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        int i = mapper.countByExample(null);
        System.out.println(i);
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}