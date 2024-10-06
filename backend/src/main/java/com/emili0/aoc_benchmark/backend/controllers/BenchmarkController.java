package com.emili0.aoc_benchmark.backend.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emili0.aoc_benchmark.backend.integration.BenchmarkDAO;
import com.emili0.aoc_benchmark.models.Benchmark;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class BenchmarkController {
    private static final Logger logger = LoggerFactory.getLogger(BenchmarkController.class);

    @Autowired
    private BenchmarkDAO benchmarkDAO;

    @GetMapping("/benchmark")
    public Benchmark[] getBenchmarks() {
        return benchmarkDAO.getAllBenchmarks().toArray(new Benchmark[0]);
    }

    @PostMapping("/benchmark")
    public void postMethodName(@RequestBody Benchmark benchmark) {
        logger.debug(benchmark.toString());
        benchmarkDAO.postBenchmark(benchmark);
        return;
    }
}
