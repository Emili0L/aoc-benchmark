package com.emili0.aoc_benchmark.backend.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;
import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;
import org.springframework.stereotype.Repository;

import com.emili0.aoc_benchmark.models.Benchmark;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class BenchmarkDAO {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(final DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        final SQLErrorCodeSQLExceptionTranslator customSQLErrorCodesTranslation = new SQLErrorCodeSQLExceptionTranslator();
        jdbcTemplate.setExceptionTranslator(customSQLErrorCodesTranslation);
    }

    public List<Benchmark> getAllBenchmarks() {
        return jdbcTemplate.query(
            "SELECT * FROM benchmark",
            new BenchmarkRowMapper()
            );
    }

    public void postBenchmark(Benchmark benchmark) {
        jdbcTemplate.update(
            "INSERT INTO benchmark(id, name, description, code) VALUES (?,?,?,?)",
            0, benchmark.getName(), benchmark.getDescription(), benchmark.getCode()
        );
        return;
    }
}
