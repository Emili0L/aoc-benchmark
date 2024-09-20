package com.emili0.aoc_benchmark.backend.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emili0.aoc_benchmark.backend.services.ChallengeService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class ChallengeController {
    @Autowired
    private ChallengeService challengeService;

    @RequestMapping("/challenge")
    public String requestMethodName() {
        return challengeService.getChallenges().getFirst().getName();
    }
}
