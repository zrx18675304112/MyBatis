package com.zrx.mybatis.mapper;

import com.zrx.mybatis.pojo.dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * 根据id查询部门表
     * @return
     */
    dept getDeptById(@Param("did") Integer did);

    /**
     * 根据部门id获取全部员工
     * @param did
     * @return
     */
    dept getDeptAndEmp(@Param("did") Integer did);

    dept getDeptAndEmpTwo(@Param("did") Integer did);

}
