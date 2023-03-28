package com.example.gateservice.reponse;

import com.example.gateservice.model.Role;
import com.example.gateservice.model.RoleFunction;
import com.example.gateservice.model.RoleUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginReponse {
    private String token;
    private List<String> roleList;
    private List<String> urlList;
}
