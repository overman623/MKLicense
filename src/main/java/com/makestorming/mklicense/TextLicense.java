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
public class TextLicense extends LicenseParent {

    private String text;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Context context;


    public static class TextLicenseBuilder {

        public TextLicenseBuilder text(String text) {
            this.text = text;
            return this;
        }

        public TextLicenseBuilder text(int resource) {
            this.text = context.getString(resource);
            return this;
        }

    }


    public static TextLicenseBuilder builder() {
        return hiddenBuilder();
    }

    public static TextLicenseBuilder builder(Context context) {
        return hiddenBuilder().context(context);
    }


}
