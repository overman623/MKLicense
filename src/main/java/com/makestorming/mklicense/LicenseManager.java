package com.makestorming.mklicense;

import android.view.View;
import java.util.ArrayList;

public class LicenseManager {

    private static LicenseManager licenseManager = null;
    private ArrayList<LicenseParent> licenses = new ArrayList<>();

    private LicenseManager(){}

    public static LicenseManager getInstance(){
        if(licenseManager == null) {
            licenseManager = new LicenseManager();
        }
        return licenseManager;
    }

    public void addLicense(LicenseParent license){
        licenses.add(license);
    }

    public View getView(){
        for(LicenseParent lp : licenses){
            if(lp instanceof ObjectLicense){
                ((ObjectLicense)lp).getTerms();
                ((ObjectLicense)lp).getLicense();
                ((ObjectLicense)lp).getCopyright();
                ((ObjectLicense)lp).getLink();
                ((ObjectLicense)lp).getName();
            }else if(lp instanceof TextLicense){
                ((TextLicense)lp).getText();
            }
        }
        return null;
    }

    //example
    //MongoDB Java Driver
    //Copyright © 2008-present MongoDB, Inc.
    //https://mongodb.github.io/mongo-java-driver/
    //Apache License 2.0

}