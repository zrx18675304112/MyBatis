package com.zrx.mybatis.mapper;

import com.zrx.mybatis.pojo.emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface EmpMapper {
    /**
     * 获取全部员工信息
     *
     * @return
     */
    List<emp> getAllEmp();

    /**
     * 查询员工以及员工所对应的部门信息
     */

    emp getEmpAndDept(@Param("eid") Integer eid);

    /**
     * 根据部门编号查询员工
     * @return
     */
    List<emp> getAllEmpByDid(@Param("did") Integer did);
}
