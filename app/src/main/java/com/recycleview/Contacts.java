package com.recycleview;

public class Contacts {

    private String Name;
    private String Phone;
    private int imgPro;

    public Contacts(String name, String phone, int imgPro) {
        Name = name;
        Phone = phone;
        this.imgPro = imgPro;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getImgPro() {
        return imgPro;
    }

    public void setImgPro(int imgPro) {
        this.imgPro = imgPro;
    }
}
