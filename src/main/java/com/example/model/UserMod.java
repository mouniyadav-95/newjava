package com.example.model;

import org.springframework.data.annotation.Id;

public class UserMod {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    private String id;
    private String name;
    private String email;
    private String role;
    private String department;
    private String password;

    public UserMod(String name, String email, String role, String department, String password) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.department = department;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserMod{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", department='" + department + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

