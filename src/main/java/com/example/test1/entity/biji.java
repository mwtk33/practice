package com.example.test1.entity;

public class biji {
    private String userimg;
    private String a;
    private String span;
    private String a1;
    private String a2;
    private String img;
    private String img1;
    private String img2;
    private String span2;

    public biji() {
    }

    public biji(String userimg, String a, String span, String a1, String a2, String img, String img1, String img2, String span2) {
        this.userimg = userimg;
        this.a = a;
        this.span = span;
        this.a1 = a1;
        this.a2 = a2;
        this.img = img;
        this.img1 = img1;
        this.img2 = img2;
        this.span2 = span2;
    }

    @Override
    public String toString() {
        return "biji{" +
                "userimg='" + userimg + '\'' +
                ", a='" + a + '\'' +
                ", span='" + span + '\'' +
                ", a1='" + a1 + '\'' +
                ", a2='" + a2 + '\'' +
                ", img='" + img + '\'' +
                ", img1='" + img1 + '\'' +
                ", img2='" + img2 + '\'' +
                ", span2='" + span2 + '\'' +
                '}';
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getSpan() {
        return span;
    }

    public void setSpan(String span) {
        this.span = span;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getSpan2() {
        return span2;
    }

    public void setSpan2(String span2) {
        this.span2 = span2;
    }
}
