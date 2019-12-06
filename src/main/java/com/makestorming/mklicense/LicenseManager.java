package com.makestorming.mklicense;

import android.view.View;

import java.util.ArrayList;

public class LicenseManager {

    private static LicenseManager licenseManager = null;

//    license term static String.
//    private final String licenseTerm = null;

    private ArrayList<License> licenses = new ArrayList<>();

    private LicenseManager(){}

    //get main object
    public static LicenseManager getInstance(){
        if(licenseManager == null) {
            licenseManager = new LicenseManager();
        }
        return licenseManager;
    }

    public void addLicense(License license){
        licenses.add(license);
    }

    public View getView(){
        //새로운 레이아웃에서 처리한다.
        return null;
    }

    //view를 리턴해서 add해아함.
    //라이센스 아이템을 빌드 해야함.

    //example
    //MongoDB Java Driver
    //Copyright © 2008-present MongoDB, Inc.
    //https://mongodb.github.io/mongo-java-driver/
    //Apache License 2.0

    public class License{
        String name;
        String copyright;
        String link;
        String license;
        String terms;
    }


    //License를 클래스 상속 예정.
    //클래스에는 기본적인 license 내용이 있음.
    //


}
