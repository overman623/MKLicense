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

    public static class Builder{
        String name;
        String copyright;
        String link;
        String license;
        String terms;

        //default term in example apache2.0, MIT
        public Builder(){
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder copyright(String copyright) {
            this.copyright = copyright;
            return this;
        }

        public Builder link(String link) {
            this.link = link;
            return this;
        }

        public Builder license(String license) {
            this.license = license;
            return this;
        }

        public Builder terms(String terms) {
            this.terms = terms;
            return this;
        }

        public License build(){
            //must error check.
            return new License(this);
        }

        public void clear() {
            this.name = null;
            this.copyright = null;
            this.link = null;
            this.license = null;
            this.terms = null;
        }
    }

}