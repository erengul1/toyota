package com.toyota.backend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GenericDAO<T> {

    Class<T> className;

    @PersistenceContext
    EntityManager entityManager;

    public GenericDAO(Class<T> className) {
        this.className = className;
    }

    public T find(String registry_id) {
        T registry = entityManager.find(className, registry_id);
        return registry;
    }



}
