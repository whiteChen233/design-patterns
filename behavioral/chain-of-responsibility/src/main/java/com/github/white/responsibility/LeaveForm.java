package com.github.white.responsibility;

public class LeaveForm {

    private String name;

    private int days;

    private String content;

    public LeaveForm(String name, int days, String content) {
        this.name = name;
        this.days = days;
        this.content = content;
    }

    public LeaveForm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
