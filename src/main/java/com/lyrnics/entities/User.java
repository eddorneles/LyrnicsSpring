package com.lyrnics.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lyrnics.enums.UserRoleEnum;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name = "user" )
public class User implements Serializable {

    private static final long serialVersionUID = 4542855591928522842L;

    @Getter
    @Setter
    @Id
    @Column( name = "id" )
    private Long id;

    @Getter
    @Setter
    @Column( name = "username" )
    private String username;

    @Getter
    @Setter
    @Column( name = "access_key" )
    private String accessKey;
    
    @Getter
    @Setter
    @Enumerated( EnumType.STRING )
    @Column( name = "role", nullable = false )
    private UserRoleEnum role;

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", accessKey=" + accessKey + ", role=" + role + "]";
    }
    
    

}// END class User