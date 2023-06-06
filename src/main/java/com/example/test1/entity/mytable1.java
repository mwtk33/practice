package com.example.test1.entity;

public class mytable1 {
    private String img;
    private String aid;
    private String pid;

    public mytable1() {
    }

    public mytable1(String img, String aid, String pid) {
        this.img = img;
        this.aid = aid;
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "mytable1{" +
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
