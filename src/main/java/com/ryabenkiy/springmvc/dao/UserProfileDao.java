package com.ryabenkiy.springmvc.dao;

import com.ryabenkiy.springmvc.model.UserProfile;

import java.util.List;


public interface UserProfileDao {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}
