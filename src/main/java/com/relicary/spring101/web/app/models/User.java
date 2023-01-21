package com.relicary.spring101.web.app.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {

    private String firstName;
    private String lastName;
    private String email;
}
