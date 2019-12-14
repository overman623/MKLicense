package com.makestorming.mklicense;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class LicenseManager {

    private static LicenseManager licenseManager = null;
    private ArrayList<LicenseParent> licenses = new ArrayList<>();
    private Context context;

    private LicenseManager(Context context){
        this.context = context;
    }

    public static LicenseManager getInstance(Context context){
        if(licenseManager == null) {
            licenseManager = new LicenseManager(context);
        }
        return licenseManager;
    }

    public void addLicense(LicenseParent license){
        licenses.add(license);
    }

    public View getView(){

        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.layout_license, null);

        TextView textView = new TextView(context);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        for(LicenseParent ip : licenses) {
            textView.setText(ip.toString());
            //객체에 따라 텍스트 세팅 예정.
        }
        textView.setLayoutParams(lp);
        textView.setTextColor(Color.parseColor("#000000"));
        linearLayout.addView(textView);

        return linearLayout;
    }

    //MongoDB Java Driver
    //Copyright © 2008-present MongoDB, Inc.
    //https://mongodb.github.io/mongo-java-driver/
    //Apache License 2.0

}