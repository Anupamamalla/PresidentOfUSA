package com.example.presidents;

public class President {
    private String name;
    private String detail;
    private int imgPres;

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

    public int getImgPres() {
        return imgPres;
    }

    public void setImgPres(int imgPres) {
        this.imgPres = imgPres;
    }

    public President(String name, String detail, int imgPres){
        this.name=name;
        this.detail=detail;
        this.imgPres=imgPres;
    }

}