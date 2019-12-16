package com.makestorming.mklicense;

import android.content.Context;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(builderMethodName = "hiddenBuilder")
public class ObjectLicense extends LicenseParent {

    private String name;
    private String copyright;
    private String link;
    private String license;
    private String terms;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Context context;

    public static class ObjectLicenseBuilder {

        public ObjectLicenseBuilder name(String text) {
            this.name = text;
            return this;
        }
        public ObjectLicenseBuilder name(int resource) {
            this.name = context.getString(resource);
            return this;
        }

        public ObjectLicenseBuilder copyright(String text) {
            this.copyright = text;
            return this;
        }
        public ObjectLicenseBuilder copyright(int resource) {
            this.copyright = context.getString(resource);
            return this;
        }

        public ObjectLicenseBuilder link(String text) {
            this.copyright = text;
            return this;
        }
        public ObjectLicenseBuilder link(int resource) {
            this.copyright = context.getString(resource);
            return this;
        }

        public ObjectLicenseBuilder license(String text) {
            this.copyright = text;
            return this;
        }
        public ObjectLicenseBuilder license(int resource) {
            this.copyright = context.getString(resource);
            return this;
        }

        public ObjectLicenseBuilder terms(String text) {
            this.copyright = text;
            return this;
        }
        public ObjectLicenseBuilder terms(int resource) {
            this.copyright = context.getString(resource);
            return this;
        }
    }

    public static ObjectLicenseBuilder builder() {
        return hiddenBuilder();
    }

    public static ObjectLicenseBuilder builder(Context context) {
        return hiddenBuilder().context(context);
    }

    @Override
    public String toString() {
        String data = null;
        if(name != null) data = name; //required
        if(copyright != null) data =  '\n' + copyright;
        if(link != null) data = '\n' + link;
        if(license != null) data = '\n' + license;
        if(terms != null) data = '\n' + terms;
        return data;
    }
}
