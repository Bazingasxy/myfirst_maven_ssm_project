package com.shen.ssm.service.impl;

import com.shen.ssm.dao.RoleDao;
import com.shen.ssm.domain.Permission;
import com.shen.ssm.domain.Role;
import com.shen.ssm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;
    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }

    @Override
    public void saveRole(Role role) {
        roleDao.saveRole(role);
    }

    @Override
    public List<Permission> findPermissionRoleById(String roleId) {
        return roleDao.findPermissionRoleById(roleId);
    }

    @Override
    public Role findById(String roleId) {
        return roleDao.findById(roleId);
    }

    @Override
    public void addPermissionToRole(String roleId, String[] ids) {
            for (String id : ids) {
            roleDao.addPermissionToRole(id,roleId);
        }
    }
}
