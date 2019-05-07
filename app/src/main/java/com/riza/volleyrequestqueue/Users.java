package com.riza.volleyrequestqueue;

public class Users {
    private String id, nama,username,email,address,geo;

    public Users (String id, String nama,String username, String email,String address,String geo){
        this.id = id;
        this.nama = nama;
        this.username = username;
        this.email = email;
        this.address = address;
        this.geo = geo;

    }
    public String getId(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getAddr(){
        return address;
    }
    public String getGeo(){
        return geo;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public  void setAddr(){
        this.address = address;
    }
    public void setGeo(){
        this.geo = geo;
    }
}
