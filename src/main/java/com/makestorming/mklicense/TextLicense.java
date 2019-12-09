package com.makestorming.mklicense;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TextLicense extends LicenseParent {

    private String text;

}
