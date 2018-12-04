package com.shen.ssm.service;


import com.shen.ssm.domain.Permission;
import com.shen.ssm.domain.Role;
import java.util.List;
public interface RoleService {

    List<Role> findAll();

    void saveRole(Role role);

    List<Permission> findPermissionRoleById(String roleId);

    Role findById(String roleId);

    void addPermissionToRole(String roleId, String[] ids);
}
