package com.example.demo.repository;

import com.example.demo.model.PersonaDev;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaDev, Long> {

}
