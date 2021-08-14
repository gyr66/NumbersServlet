package com.gyr.dao.impl;

import com.gyr.dao.RecordDao;
import com.gyr.domain.Record;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RecordDaoImpl implements RecordDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Record> listRecord() {
        return jdbcTemplate.query("SELECT * FROM main", new BeanPropertyRowMapper<Record>(Record.class));
    }

    @Override
    public int insertRecord(Record record) {
        return jdbcTemplate.update("INSERT INTO main(ip, dateTime, type, steps, seconds) " +
                "VALUES (?, ?, ?, ?, ?)", record.getIp(), record.getDateTime(), record.getType(), record.getSteps(), record.getSeconds());
    }
}
