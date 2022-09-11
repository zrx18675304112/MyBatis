package com.zrx.mybatis.mapper;

import com.zrx.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface parameterMapper {
    /**
     * 查找所有用户
     * @return
     */
    List<User> getAllUsers();

    /**
     * 添加用户
     * @return
     */
    int InsertToUser(User user);

    /**
     * 根据用户名与密码查找用户
     * @return
     */
    User gerUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
