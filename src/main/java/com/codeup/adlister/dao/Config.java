package com.codeup.adlister.dao;

class Config {

    public String getUrl() {
        return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    }

    public String getUser() {
        return "chief";
    }

    public String getPassword() {
        return "chief";
    }
}
