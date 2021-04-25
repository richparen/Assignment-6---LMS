package kz.iitu.lms.controller;

import kz.iitu.lms.model.Book;
import kz.iitu.lms.service.iBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private iBookService iBookService;

    public Book get(Long id) {
        return iBookService.getById(id);
    }

    public Book create(Book o){
        return iBookService.create(o);
    }
}
