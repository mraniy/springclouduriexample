package com.example.sportgameservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


interface SportGameRepository extends JpaRepository<SportGame, Long> {

//    @RestResource(path = "by-team1")
//    List<SportGame> findByTeam1(@Param("team1") String team1);

}
