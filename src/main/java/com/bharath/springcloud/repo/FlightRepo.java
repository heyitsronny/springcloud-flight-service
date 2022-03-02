package com.bharath.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.springcloud.model.Flight;

public interface FlightRepo extends JpaRepository<Flight, Long> {


}
