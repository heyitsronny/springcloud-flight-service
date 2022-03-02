package com.bharath.springcloud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.springcloud.model.Flight;
import com.bharath.springcloud.repo.FlightRepo;

@RestController
@RequestMapping("/flightapi")
public class FlightRestController {

    @Autowired
    FlightRepo flightRepo;

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public List<Flight> getAll() {
        return flightRepo.findAll();
    }


}
