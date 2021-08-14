package com.gyr.domain;

public class Record {
    private String dateTime;
    private String type;
    private int steps;
    private int seconds;
    private String ip;

    public Record() {
    }

    public Record(String dateTime, String type, int steps, int seconds, String ip) {
        this.dateTime = dateTime;
        this.type = type;
        this.steps = steps;
        this.seconds = seconds;
        this.ip = ip;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Record{" +
                "dateTime='" + dateTime + '\'' +
                ", type='" + type + '\'' +
                ", steps=" + steps +
                ", seconds=" + seconds +
                ", ip='" + ip + '\'' +
                '}';
    }
}
