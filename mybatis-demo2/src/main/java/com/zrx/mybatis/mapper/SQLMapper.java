package com.zrx.mybatis.mapper;

import com.zrx.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {

    /**
     * 根据用户名模糊查询用户信息
     */

    List<User> getUserByLike(@Param("username") String username);

    /**
     * 根据批量删除用户信息
     */

    int deleteUserById(@Param("ids") String ids);

    /**
     * 添加用户，获取自动递增的id
     * @param user
     * @return
     */
    int insertUser(User user);
}
