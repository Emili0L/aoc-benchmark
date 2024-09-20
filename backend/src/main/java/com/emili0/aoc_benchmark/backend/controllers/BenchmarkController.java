package com.emili0.aoc_benchmark.backend.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emili0.aoc_benchmark.backend.integration.BenchmarkDAO;
import com.emili0.aoc_benchmark.models.Benchmark;

@RestController
public class BenchmarkController {
    @Autowired
    private BenchmarkDAO benchmarkDAO;

    @GetMapping("/benchmark")
    public Benchmark[] getBenchmarks() {
        return benchmarkDAO.getAllBenchmarks().toArray(new Benchmark[0]);
    }
}
