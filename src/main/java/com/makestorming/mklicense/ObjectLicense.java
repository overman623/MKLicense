package com.makestorming.mklicense;

import lombok.Builder;

@Builder
public class ObjectLicense extends LicenseParent {
    private String name;
    private String copyright;
    private String link;
    private String license;
    private String terms;
}
