package com.toyota.backend.service;

import com.toyota.backend.dao.workersDAO;
import com.toyota.backend.dto.workersDTO;
import com.toyota.backend.entity.Workers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service
public class WorkersService implements Serializable {


    @Autowired
   private workersDAO workersDAO;

    @Transactional
    public workersDTO getRegistry(String registry_id)
    {
        Workers worker;

        try {

            worker=workersDAO.find(registry_id);
        }
        catch (Exception e) {
            return null;
        }

        return new workersDTO().convert(worker);
    }



}
