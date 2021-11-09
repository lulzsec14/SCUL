package com.example.learningspring.Controller;

import com.example.learningspring.Beans.User;
import com.example.learningspring.DB.DBUser;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.learningspring.Beans.Company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class Controller {

    DBUser obj = new DBUser();

    @GetMapping("/users")
    public List<User> searchWord(){
        List<User> res;
        res = obj.getAllUsers();
        return res;
    }

    @GetMapping("/users/{id}")
    public User getAUser(@PathVariable int id){
        User findUser =  obj.getAUser(id);
        return findUser;
    }



}
