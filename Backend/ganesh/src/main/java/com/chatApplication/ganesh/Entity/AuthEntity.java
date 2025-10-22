package com.chatApplication.ganesh.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Types;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("authentication")
public class AuthEntity {

    @Id
    private String userId= UUID.randomUUID().toString();
    private String userName;
    private String password;

    private Role role=Role.USER;


    public enum Role{
        USER,
        ADMIN
    };


}
