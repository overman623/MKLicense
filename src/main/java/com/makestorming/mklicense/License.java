package com.makestorming.mklicense;

public class License{
    private String name;
    private String copyright;
    private String link;
    private String license;
    private String terms;

    private License(Builder builder){
        this.name = builder.name;
        this.copyright = builder.copyright;
        this.link = builder.link;
        this.license = builder.license;
        this.terms = builder.terms;
    }

    public class Builder{
        String name;
        String copyright;
        String link;
        String license;
        String terms;

        public Builder(String terms){
            this.terms = terms;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setCopyright(String copyright) {
            this.copyright = copyright;
            return this;
        }

        public Builder setLink(String link) {
            this.link = link;
            return this;
        }

        public Builder setLicense(String license) {
            this.license = license;
            return this;
        }

        public Builder setTerms(String terms) {
            this.terms = terms;
            return this;
        }

        public License build(){
            //must error check.
            return new License(this);
        }

    }

}