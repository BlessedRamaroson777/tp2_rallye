package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final RallyeRepository repository;

    public DataLoader(RallyeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Seed some sample data
        repository.save(new Rallye("Rallye Antananarivo"));
        repository.save(new Rallye("Rallye Tamatave"));
    }
}
