package com.gyr.controller;

import com.gyr.domain.Record;
import com.gyr.domain.RecordVO;
import com.gyr.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller

public class RecordController {
    @Autowired
    private RecordService recordService;

    @RequestMapping(value = "/record", method = RequestMethod.GET)
    @ResponseBody
    public List<Record> listRecord() {
        return recordService.listRecord();
    }

    @RequestMapping(value = "/record", method = RequestMethod.POST)
    @ResponseBody
    public boolean postRecord(@RequestBody RecordVO recordVO, HttpServletRequest request) {
        Record record = new Record();
        record.setIp(request.getRemoteAddr());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        record.setDateTime(format.format(new Date()));
        record.setType(recordVO.getType());
        record.setSeconds(recordVO.getSeconds());
        record.setSteps(recordVO.getSteps());
        return recordService.postRecord(record) == 1;
    }


}
