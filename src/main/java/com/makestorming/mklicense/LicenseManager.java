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

//        StringBuilder sb = new StringBuilder();

        /*for(LicenseParent lp : licenses){
            if(lp instanceof ObjectLicense){
                sb.append(((ObjectLicense)lp).getName()).append('\n'); //required
                sb.append(((ObjectLicense)lp).getCopyright()).append('\n');
                sb.append(((ObjectLicense)lp).getLink()).append('\n'); //linked
                sb.append(((ObjectLicense)lp).getLicense()).append('\n');
                sb.append(((ObjectLicense)lp).getTerms());
            }else if(lp instanceof TextLicense){
                sb.append(((TextLicense)lp).getText()); //required
            }
        }*/





        return null;
    }

    //MongoDB Java Driver
    //Copyright © 2008-present MongoDB, Inc.
    //https://mongodb.github.io/mongo-java-driver/
    //Apache License 2.0

}