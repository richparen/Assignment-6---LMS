package kz.iitu.lms.controller;

import kz.iitu.lms.model.User;
import kz.iitu.lms.service.iUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private iUserService iUserService;

     public User get(Long id) {
        return iUserService.getById(id);
    }

    public User create(User o){
        return iUserService.create(o);
    }
}
