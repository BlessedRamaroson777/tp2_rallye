package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rallyes")
public class RallyeController {

    private final RallyeRepository repository;

    public RallyeController(RallyeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Rallye> all() {
        return repository.findAll();
    }
}
