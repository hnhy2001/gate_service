package com.example.gateservice.service.Impl;



import com.example.gateservice.model.RoleFunction;
import com.example.gateservice.repository.BaseRepository;
import com.example.gateservice.repository.RoleFunctionRepository;
import com.example.gateservice.service.RoleFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleFunctionServiceImpl extends BaseServiceImpl<RoleFunction> implements RoleFunctionService {
    @Autowired
    RoleFunctionRepository roleFunctionRepository;
    @Override
    protected BaseRepository<RoleFunction> getRepository() {
        return roleFunctionRepository;
    }
}
