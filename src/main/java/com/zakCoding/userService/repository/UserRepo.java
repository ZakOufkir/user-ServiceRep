package com.zakCoding.userService.repository;


import com.zakCoding.userService.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserProfile, Long> {


}
