package com.shen.ssm.dao;

import com.shen.ssm.domain.Role;
import com.shen.ssm.domain.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    /**
     * 根据账号密码查找用户
     */
    UserInfo findUserByUsername(String username);

    /**
     * 查找所有用户
     */
    List<UserInfo> findAll();

    void saveUser(UserInfo userInfo);

    UserInfo showUserById(String id);

    void deleteUser(String id);

    List<Role> findUserRoleById(String userId);

    void addRoleToUser(@Param("userId") String userId, @Param("roleId") String roleId);

    UserInfo findById(String userId);
}
