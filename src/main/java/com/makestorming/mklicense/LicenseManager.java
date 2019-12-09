package com.makestorming.mklicense;

import android.view.View;
import java.util.ArrayList;

public class LicenseManager {

    private static LicenseManager licenseManager = null;
//    license term static String.
//    private final String licenseTerm = null;
    private ArrayList<LicenseParent> licenses = new ArrayList<>();

    private LicenseManager(){}

    //get main object
    public static LicenseManager getInstance(){
        if(licenseManager == null) {
            licenseManager = new LicenseManager();
        }
        return licenseManager;
    }

    //부모뷰의 추가.
    public void addLicense(LicenseParent license){
        licenses.add(license);
    }

    //일단 텍스트 추가
    //단순 텍스트와 형식이 있는 텍스트를 구분한다.
    //단순텍스트와 형식이 있는 텍스트를 구분해서 클래스로 구분한다.
    //단순텍스트는 메모장 형식이고 형식텍스트는 제목과 내용등을 구분해서 기입한다.
    //형식텍스트는 5개의 하위 항목으로 나눈다.
    //형식텍스트의 정의 방식.

    public View getView(){
        //새로운 레이아웃에서 처리한다.
        //뷰가 없을 때 에러처리.
        for(LicenseParent lp : licenses){
            if(lp instanceof ObjectLicense){
                ((ObjectLicense)lp).setTerms("");
            }else if(lp instanceof TextLicense){
                ((TextLicense)lp).setText("");
            }
        }
        return null;
    }

    //view를 리턴해서 add해아함.
    //라이센스 아이템을 빌드 해야함.

    //example
    //MongoDB Java Driver
    //Copyright © 2008-present MongoDB, Inc.
    //https://mongodb.github.io/mongo-java-driver/
    //Apache License 2.0

}