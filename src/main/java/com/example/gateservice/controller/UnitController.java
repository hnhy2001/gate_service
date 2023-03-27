package com.example.gateservice.controller;


import com.example.gateservice.model.Unit;
import com.example.gateservice.service.BaseService;
import com.example.gateservice.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("unit")
public class UnitController extends BaseController<Unit>{
    @Autowired
    UnitService unitService;
    @Override
    protected BaseService<Unit> getService() {
        return unitService;
    }
}
