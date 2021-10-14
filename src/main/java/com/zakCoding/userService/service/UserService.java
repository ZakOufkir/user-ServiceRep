package com.zakCoding.userService.service;

import com.zakCoding.userService.entity.UserProfile;
import com.zakCoding.userService.repository.UserRepo;
import com.zakCoding.userService.viewObj.Department;
import com.zakCoding.userService.viewObj.ResponseTemplate;
import com.zakCoding.userService.viewObj.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
    @Autowired
    RestTemplate restTemplate;

    public UserProfile saveUserEntity(UserProfile user) {
       return userRepo.save(user);

    }

    public ResponseTemplate getUserAndDepartment(Long id) {
         UserProfile userProfile = null;
        ResponseTemplate responseTemplate = null;
         Optional<UserProfile> users = userRepo.findById(id);
         if (users.isPresent()){
             userProfile = users.get();

         }
         if (userProfile!=null){
            Long userId =  userProfile.getUserId();
             User user = restTemplate.
                     getForObject ("http://localhost:8081/users/"+userId, User.class);
             Department department = restTemplate.
                     getForObject("http://localhost:8081/departments/"+user.getDepartmentId(),Department.class );

             responseTemplate.setUser(user);
             responseTemplate.setDepartment(department);
             
         }
         return responseTemplate;


    }
}
