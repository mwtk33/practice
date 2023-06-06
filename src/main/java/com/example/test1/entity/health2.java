package com.example.test1.entity;

public class health2 {
    private String img;
    private String a;
    private String p;
    private String span;

    public health2() {
    }

    public health2(String img, String a, String p, String span) {
        this.img = img;
        this.a = a;
        this.p = p;
        this.span = span;
    }

    @Override
    public String toString() {
        return "health2{" +
                "img='" + img + '\'' +
                ", a='" + a + '\'' +
                ", p='" + p + '\'' +
                ", span='" + span + '\'' +
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

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getSpan() {
        return span;
    }

    public void setSpan(String span) {
        this.span = span;
    }
}
