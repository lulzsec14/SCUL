package com.example.learningspring.Controller;

import com.example.learningspring.Beans.User;
import com.example.learningspring.DB.DBUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
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
    public ResponseEntity<User> getAUser(@PathVariable int id){
        User findUser =  obj.getAUser(id);
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.put("server", Collections.singletonList("codeofChitkara"));
        HttpStatus status = HttpStatus.CREATED;
        ResponseEntity<User> response =
                new ResponseEntity<User>(findUser,headers,status);
//        return findUser;
        return response;
    }

    @GetMapping("/user")
    public User getAUser(@RequestParam String q){
        return obj.getAUserByName(q);
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean createUser(@RequestBody User user){
        return obj.addUser(user);
    }

    @DeleteMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteAUser(@PathVariable int id){
        return obj.deleteAUser(id);
    }


}
