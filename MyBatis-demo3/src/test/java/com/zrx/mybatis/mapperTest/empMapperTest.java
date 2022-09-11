package com.zrx.mybatis.mapperTest;

import com.zrx.mybatis.mapper.EmpMapper;
import com.zrx.mybatis.pojo.emp;
import com.zrx.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class empMapperTest {
    @Test
    public void TestGetAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<emp> allEmp = mapper.getAllEmp();
        for (emp emp : allEmp) {
            System.out.println(emp);
        }
    }

    @Test
    public void TestEmpAndDeptOnDid() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        emp empAndDept = mapper.getEmpAndDept(3);
        System.out.println(empAndDept);
    }

    @Test
    public void TestGetEmpAndDept() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        emp empAndDept = mapper.getEmpAndDept(4);
        System.out.println(empAndDept.getSex());
    }
}
