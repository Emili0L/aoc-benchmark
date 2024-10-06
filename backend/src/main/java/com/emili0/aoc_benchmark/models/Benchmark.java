package com.emili0.aoc_benchmark.models;

public class Benchmark {
    private int id;
    private String name;
    private String description;
    private byte[] code;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public byte[] getCode() {
        return this.code;
    }
    public void setCode(byte[] code) {
        this.code = code;
    }
}
