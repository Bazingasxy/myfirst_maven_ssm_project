package com.shen.ssm.dao;

import com.shen.ssm.domain.Permission;
import com.shen.ssm.domain.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao {
    List<Role> findAll();

    void saveRole(Role role);

    List<Permission> findPermissionRoleById(String roleId);

    Role findById(String roleId);

    void addPermissionToRole(@Param("id") String id, @Param("roleId") String roleId);
}
