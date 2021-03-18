package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
    // gets an ad by user id
     Ad individualAd(Long id);





    List<Ad> getAdsByUser(long id);

    List<Ad> search(String term);

    List<Ad> deleteAd(long id);
}
