package com.ryabenkiy.springmvc.service;

import com.ryabenkiy.springmvc.model.UserProfile;

import java.util.List;


public interface UserProfileService {

    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();

}