package com.toyota.backend.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "WORKERS")
public class Workers {

    public Workers(@NotBlank char[] password, boolean role, String manager, String department, String name, String surname) {
        this.password = password;
        this.role = role;
        this.manager = manager;
        this.department = department;
        this.name = name;
        this.surname = surname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "registry_id")
    private String registry_id;

    @NotBlank
    @Column(name = "password")
    private char[] password;

    @Column(name = "role")
    private boolean role; //1 is admin, 0 is user

    @Column(name = "manager")
    private String manager;

    @Column(name = "department")
    private String department;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    public Workers() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getRegistry_id() {
        return registry_id;
    }

    public void setRegistry_id(String registry_id) {
        this.registry_id = registry_id;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
