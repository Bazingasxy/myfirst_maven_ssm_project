package com.shen.ssm.service;

import com.shen.ssm.domain.Permission;

import java.util.List;

public interface PermissionService {
    List<Permission> findAll();

    void savePermission(Permission permission);
}
