package com.example.demo.database;

import com.example.demo.model.PersonaDev;
import com.example.demo.repository.PersonaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDataBase {
    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    CommandLineRunner initDatabase(PersonaRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new PersonaDev(1L, "Bilbo Baggins", "burglar")));
            log.info("Preloading " + repository.save(new PersonaDev(2L, "Frodo Baggins", "thief")));
        };
    }
}

