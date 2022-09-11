package com.zrx.mybatis.mapperTest;

import com.zrx.mybatis.mapper.DynamicSQLMapper;
import com.zrx.mybatis.pojo.emp;
import com.zrx.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DynamicSQLMapperTest {
    /**
     * 动态sql查询
     * if标签根据标签中test属性所对应的表达式中的内容来决定是否拼接到Sql中
     * 
     */
    @Test
    public void TestGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<emp> empByCondition = mapper.getEmpByCondition(new emp(null, "张三", 19, "男", null, null));
        System.out.println(empByCondition);
    }

    @Test
    public void TestDeleteMoreByArray(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession(true);
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int i = mapper.deleteMoreByArray(new Integer[]{7,8,9});
        System.out.println(i);
    }
}
