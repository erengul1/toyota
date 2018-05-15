package com.toyota.backend.dao;


import com.toyota.backend.entity.Workers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class workersDAO extends GenericDAO<Workers> {


    public workersDAO() {
        super(Workers.class);
    }
}
