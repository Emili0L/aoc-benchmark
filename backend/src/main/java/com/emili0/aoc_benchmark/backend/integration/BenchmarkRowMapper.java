package com.emili0.aoc_benchmark.backend.integration;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import com.emili0.aoc_benchmark.models.Benchmark;

public class BenchmarkRowMapper implements RowMapper<Benchmark> {
    private static final Logger logger = LoggerFactory.getLogger(BenchmarkRowMapper.class);

    @Override
    public Benchmark mapRow(final ResultSet rs, final int rowNum) throws SQLException {
        final Benchmark benchmark = new Benchmark();

        benchmark.setId(rs.getInt("id"));
        benchmark.setName(rs.getString("name"));
        benchmark.setDescription(rs.getString("description"));
        benchmark.setCode(rs.getBytes("code"));

        return benchmark;
    }
}
