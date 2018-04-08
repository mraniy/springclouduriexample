package com.example.sportgameservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class DummyDataClr implements CommandLineRunner{

    @Autowired
    private SportGameRepository sportGameRepository;
    @Override
    public void run(String... args) throws Exception {

        SportGame sportGame1 = new SportGame("FC barcelone", "Sevilla");
        SportGame sportGame2 = new SportGame("Real madrid", "Las Palmas");
        Stream.of(sportGame1,sportGame2).forEach(sportGame -> sportGameRepository.save(sportGame));
    }
}
