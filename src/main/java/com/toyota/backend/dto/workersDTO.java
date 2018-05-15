package com.toyota.backend.dto;


import com.toyota.backend.entity.Workers;


public class workersDTO {


    public workersDTO convert(Workers entity)
    {

       this.setRegistry_id(entity.getRegistry_id());
        this.setPassword(entity.getPassword());
        this.setRole(entity.isRole());
        this.setManager(entity.getManager());
        this.setDepartment(entity.getDepartment());
        this.setName(entity.getName());
        this.setSurname(entity.getSurname());


        return this;
    }


    private String registry_id;

    private char[] password;

    private boolean role; //1 is admin, 0 is user

    private String manager;

    private String department;

    private String name;

    private String surname;

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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public workersDTO() {
    }

    public workersDTO(String registry_id, char[] password, boolean role, String manager, String department, String name, String surname) {
        this.registry_id = registry_id;
        this.password = password;
        this.role = role;
        this.manager = manager;
        this.department = department;
        this.name = name;
        this.surname = surname;
    }
}
