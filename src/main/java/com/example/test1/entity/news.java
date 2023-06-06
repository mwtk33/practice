package com.example.test1.entity;

public class news {
    private String title;
    private String time;

    public news() {
    }

    public news(String title, String time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "news{" +
                "title='" + title + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

}
