package com.zrx.mybatis.mapper;

import com.zrx.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * MyBatis面向接口编程的两个一致：
     * 1.映射文件的namespace要和mapper接口的全类目保持一致
     * 2.映射文件中的SQL语句的id要和mapper接口中的方法一致
     */

    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     * @return
     */
    int updateUser();

    /**
     * 查询全部用户
     * @return
     */
    List<User> SelectUser();

    /**
     * 根据id查找用户信息
     * @return
     */
    User SelectUserById();

    /**
     * 删除用户
     * @return
     */
    int deleteUser();
}
