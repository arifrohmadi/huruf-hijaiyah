package com.blogspot.arifrohmadi.hurufhijaiyah.model;

public class Huruf {
    private String name;
    private String detail;
    private String sifat;
    private int photo;
    private int photo_makhraj;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getSifat() {
        return sifat;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public int getPhoto_makhraj() {
        return photo_makhraj;
    }

    public void setPhoto_makhraj(int photo_makhraj) {
        this.photo_makhraj = photo_makhraj;
    }
}
