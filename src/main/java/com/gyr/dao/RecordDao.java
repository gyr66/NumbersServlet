package com.gyr.dao;

import com.gyr.domain.Record;

import java.util.List;

public interface RecordDao {
    List<Record> listRecord();

    int insertRecord(Record record);
}
