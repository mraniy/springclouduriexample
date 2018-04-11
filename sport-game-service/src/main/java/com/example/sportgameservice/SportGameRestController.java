package com.example.sportgameservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SportGameRestController {

    @Autowired
    private SportGameRepository sportGameRepository;

    @GetMapping("/teams")
    public List<SportGame> getSportGames() {
        return sportGameRepository.findAll();
    }
}
