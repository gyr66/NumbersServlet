package com.gyr.domain;

public class RecordVO {
    private String type;
    private int seconds;
    private int steps;

    @Override
    public String toString() {
        return "RecordVO{" +
                "type='" + type + '\'' +
                ", seconds=" + seconds +
                ", steps=" + steps +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public RecordVO(String type, int seconds, int steps) {
        this.type = type;
        this.seconds = seconds;
        this.steps = steps;
    }

    public RecordVO() {
    }
}
