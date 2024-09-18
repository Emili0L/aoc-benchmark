package com.emili0.aoc_benchmark.models;

// import lombok.Data;  
  
// import javax.persistence.*;  
// import java.io.Serializable;  
// import java.time.LocalDate;  

public class Challenge {
    private int id;
    private String name;
    private String result;
    public Challenge(int id, String name, String result) {
        this.id = 0;
        this.name = name;
        this.result = result;
    }
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
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
}
