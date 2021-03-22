package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
    // gets an ad by user id
     Ad individualAd(Long id);
     // update user profile

    void updateProfile(String username, String password, String email, long id);

    List<Ad> updateAd(long id,String title,String description);

    List<Ad> getAdsByUser(long id);

    List<Ad> search(String term);

    List<Ad> deleteAd(long id);

    Ad byAdID(long id);
}
