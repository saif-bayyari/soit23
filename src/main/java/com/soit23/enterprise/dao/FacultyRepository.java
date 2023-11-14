package com.soit23.enterprise.dao;

import com.soit23.enterprise.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface FacultyRepository extends JpaRepository<Faculty, Integer> {


    //Method  to show the results by last name ascending.
    public List<Faculty>findAllByOrderByLastNameAsc();
}
