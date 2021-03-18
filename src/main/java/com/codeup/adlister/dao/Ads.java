package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
    // gets an ad by user id
    List<Ad> getAdsByUser(Long userId);

    List<Ad> getAdsByUser(long id);

    List<Ad> search(String term);

    List<Ad> deleteAd(long id);
}
