package com.toyota.backend.controller;


import com.toyota.backend.dto.workersDTO;
import com.toyota.backend.service.WorkersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/workers")
public class WorkersController {

    @Autowired
    WorkersService workersService;



    @GetMapping(value = "/{registryId}",produces={MediaType.APPLICATION_JSON_VALUE})
    public workersDTO getRegistry(@PathVariable("registryId") String registry_id)
    {
        return workersService.getRegistry(registry_id);
    }


}
