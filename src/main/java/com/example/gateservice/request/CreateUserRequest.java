package com.example.gateservice.request;

import com.example.gateservice.model.Unit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateUserRequest {
    private String name;
    private String code;
    private int isActive = 1;
    private Date createDate;
    private Date updateDate;
    private String userName;
    private String password;
    private String email;
    private String address;
    private Long unitId ;
    private Long roleId;
}
