package com.gyr.service.Impl;

import com.gyr.dao.RecordDao;
import com.gyr.domain.Record;
import com.gyr.service.RecordService;

import java.util.List;

public class RecordServiceImpl implements RecordService {
    private RecordDao recordDao;

    public void setRecordDao(RecordDao recordDao) {
        this.recordDao = recordDao;
    }

    @Override
    public List<Record> listRecord() {
        return recordDao.listRecord();
    }

    @Override
    public int postRecord(Record record) {
        return recordDao.insertRecord(record);
    }
}
