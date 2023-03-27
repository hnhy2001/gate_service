package com.example.gateservice.service.Impl;

import com.example.gateservice.model.Function;
import com.example.gateservice.repository.BaseRepository;
import com.example.gateservice.repository.FunctionRepository;
import com.example.gateservice.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FunctionServiceImpl extends BaseServiceImpl<Function> implements FunctionService {
    @Autowired
    FunctionRepository functionRepository;
    @Override
    protected BaseRepository<Function> getRepository() {
        return functionRepository;
    }
}
