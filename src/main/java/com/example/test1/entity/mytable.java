package com.example.test1.entity;

public class mytable {
    private String img;
    private String aid;
    private String pid;

    public mytable() {
    }

    public mytable(String img, String aid, String pid) {
        this.img = img;
        this.aid = aid;
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "mytable{" +
                "img='" + img + '\'' +
                ", aid='" + aid + '\'' +
                ", pid='" + pid + '\'' +
                '}';
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}
