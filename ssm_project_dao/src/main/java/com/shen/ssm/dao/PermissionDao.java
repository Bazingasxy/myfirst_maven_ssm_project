package com.shen.ssm.dao;

import com.shen.ssm.domain.Permission;
import java.util.List;
public interface PermissionDao {

    List<Permission>findAll();

    void savePermission(Permission permission);
}
