package com.shen.ssm.service;

import com.shen.ssm.domain.Role;
import com.shen.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;
import java.util.List;

public interface UserService extends UserDetailsService {

    List<UserInfo> findAll();

    void saveUser(UserInfo userInfo);

    UserInfo showUserById(String id);

    void deleteUser(String id);

    List<Role> findUserRoleById(String userId);

    void addRoleToUser(String userId, String[] ids);

    UserInfo findById(String userId);
}
