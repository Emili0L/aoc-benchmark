package com.emili0.aoc_benchmark.models;

public class Benchmark {
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCode() {
        return Code;
    }
    public void setCode(String code) {
        Code = code;
    }
    private String description;
    private String Code;
}
