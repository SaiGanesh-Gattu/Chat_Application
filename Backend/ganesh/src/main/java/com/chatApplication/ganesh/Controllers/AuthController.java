package com.chatApplication.ganesh.Controllers;


import com.chatApplication.ganesh.Entity.AuthEntity;
import com.chatApplication.ganesh.Repositories.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/authentication")
class AuthController{

    @Autowired
    private AuthRepository authRepository;

    @PostMapping("/login")
    private ResponseEntity<?> userLogin(@RequestBody AuthEntity authEntity){
        authRepository.save(authEntity);
        return  ResponseEntity.status(HttpStatus.OK).body(authEntity);
    }

}
