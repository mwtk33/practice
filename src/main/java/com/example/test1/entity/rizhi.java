package com.example.test1.entity;

public class rizhi {
    private String img;
    private String a;
    private String span;
    private String a1;
    private String a2;
    private String a3;

    public rizhi() {
    }

    public rizhi(String img, String a, String span, String a1, String a2, String a3) {
        this.img = img;
        this.a = a;
        this.span = span;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    @Override
    public String toString() {
        return "rizhi{" +
                "img='" + img + '\'' +
                ", a='" + a + '\'' +
                ", span='" + span + '\'' +
                ", a1='" + a1 + '\'' +
                ", a2='" + a2 + '\'' +
                ", a3='" + a3 + '\'' +
                '}';
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }
}
