package com.gyr.service;

import com.gyr.domain.Record;

import java.util.List;

public interface RecordService {
    List<Record> listRecord();

    int postRecord(Record record);
}
