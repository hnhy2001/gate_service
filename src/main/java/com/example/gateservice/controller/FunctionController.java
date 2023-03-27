package com.example.gateservice.controller;

import com.example.gateservice.model.Function;
import com.example.gateservice.service.BaseService;
import com.example.gateservice.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("function")
public class FunctionController extends BaseController<Function> {
    @Autowired
    FunctionService functionService;
    @Override
    protected BaseService<Function> getService() {
        return functionService;
    }
}
