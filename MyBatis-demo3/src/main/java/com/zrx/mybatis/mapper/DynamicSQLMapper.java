package com.zrx.mybatis.mapper;

import com.zrx.mybatis.pojo.emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    /**
     * 多条件查询
     * @param E
     * @return
     */
    List<emp> getEmpByCondition(emp E);

    /**
     * 批量删除
     * @param integers
     * @return
     */
    int deleteMoreByArray(@Param("integers") Integer[] integers);
}
