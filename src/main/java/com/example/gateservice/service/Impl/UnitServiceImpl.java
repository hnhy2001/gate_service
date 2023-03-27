package com.example.gateservice.service.Impl;

import com.example.gateservice.model.Unit;
import com.example.gateservice.repository.BaseRepository;
import com.example.gateservice.repository.UnitRepository;
import com.example.gateservice.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitServiceImpl extends BaseServiceImpl<Unit> implements UnitService {
    @Autowired
    UnitRepository unitRepository;
    @Override
    protected BaseRepository<Unit> getRepository() {
        return unitRepository;
    }
}
