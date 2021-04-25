package kz.iitu.lms;

import kz.iitu.lms.config.ProjectConfig;
import kz.iitu.lms.model.Book;
import kz.iitu.lms.model.User;
import kz.iitu.lms.repository.BookRepository;
import kz.iitu.lms.repository.UserRepository;
import kz.iitu.lms.service.impl.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        UserRepository userRepository = context.getBean("userRepository", UserRepository.class);
        BookRepository bookRepository = context.getBean("bookRepository", BookRepository.class);

        System.out.println("userRepository.findAll() = " + userRepository.findAll());

        User user = new User();
        user.setFullName("New user");


        Book book = new Book();
        book.setName("New Book");
        book.setAuthor(user);

        bookRepository.save(book);
        userRepository.save(user);


        System.out.println("bookRepository.findAll() = " + bookRepository.findAll());
        System.out.println("studentRepository.findAll() = " + userRepository.findAll());
    }
}
