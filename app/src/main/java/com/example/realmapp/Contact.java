package com.example.realmapp;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class
Contact extends RealmObject {
    
    @PrimaryKey
    private long id;

    @Required
    private String nameNumber;

//    @Required
//    private String name;

//    @Required
//    private String numero;

    private int age;
    private boolean gender;

    public Contact(){

    }
    public Contact(long idExt, String nameExt, String numberExt){
        id = idExt;
//        name = nameExt;
//        numero = numberExt;
    }
    public Contact(long idExt, String nameExt, int edadExt, boolean generoExt){
        id = idExt;
        nameNumber = nameExt;
//        numero = numberExt;
        age = edadExt;
        gender = generoExt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getNumero() {
//        return numero;
//    }
//
//    public void setNumero(String numero) {
//        this.numero = numero;
//    }

    public String getNameNumber() {
        return nameNumber;
    }

    public void setNameNumber(String nameNumber) {
        this.nameNumber = nameNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
