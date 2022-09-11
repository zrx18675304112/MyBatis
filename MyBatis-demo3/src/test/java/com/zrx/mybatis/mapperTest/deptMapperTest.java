package com.zrx.mybatis.mapperTest;

import com.zrx.mybatis.mapper.DeptMapper;
import com.zrx.mybatis.pojo.dept;
import com.zrx.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class deptMapperTest {

    @Test
    public void TestgetDeptAndEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        dept deptAndEmp = mapper.getDeptAndEmp(2);
        System.out.println(deptAndEmp);
    }

    @Test
    public void TestGetDeptAndEmpTwo(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        dept deptAndEmpTwo = mapper.getDeptAndEmpTwo(3);
        System.out.println(deptAndEmpTwo);
    }
}
