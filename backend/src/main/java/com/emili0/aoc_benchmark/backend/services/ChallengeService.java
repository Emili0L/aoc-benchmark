package com.emili0.aoc_benchmark.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.emili0.aoc_benchmark.models.Challenge;

@Component
public class ChallengeService {
    @Autowired
    private ApplicationContext context;

    public List<Challenge> getChallenges() {
        var challenge = new Challenge(0,"Test","Result");
        return List.of(challenge);
    }
}
