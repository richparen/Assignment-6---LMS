package kz.iitu.lms.controller;

import kz.iitu.lms.model.Userbooks;
import kz.iitu.lms.service.iUserBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserBookController {

    @Autowired
    private iUserBookService iUserBookService;

    public Userbooks create(Userbooks o){
        return iUserBookService.create(o);
    }

    public Userbooks get(Long id){
        return iUserBookService.getById(id);
    }
}
