package com.cos.mediAPI.login;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Getter
public class SessionUser implements Serializable {
	private Long id;
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
    	this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}