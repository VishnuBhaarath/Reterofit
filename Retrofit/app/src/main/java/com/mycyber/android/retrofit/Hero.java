package com.mycyber.android.retrofit;

public class Hero {

    private String name;
    private String id;


    public Hero(String id, String name) {
        this.name = name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public String getId(){
        return id;
    }

}
