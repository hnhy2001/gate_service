package com.example.gateservice.repository;

import com.example.gateservice.model.RoleFunction;

import java.util.List;

public interface RoleFunctionRepository extends BaseRepository<RoleFunction>{
    List<RoleFunction> findAllByRoleId(Long roleId);
}
