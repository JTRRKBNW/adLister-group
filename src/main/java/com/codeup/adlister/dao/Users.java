package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

public interface Users {
    User findByUsername(String username);
    Long insert(User user);
    User findUserByID(long userId);
    Ad individualAd(Long id);
    void updateProfile(String username, String password, String email, long id);
}
