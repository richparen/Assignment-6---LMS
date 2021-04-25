package kz.iitu.lms.service.impl;

import kz.iitu.lms.model.User;
import kz.iitu.lms.repository.UserRepository;
import kz.iitu.lms.service.iUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements iUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User o) {
        return userRepository.save(o);
    }

    @Override
    public User update(User o) {
        return userRepository.save(o);
    }

    @Override
    public void delete(Long o) {
        userRepository.delete(getById(o));
    }

    @Override
    public User getById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getAllByName(String name) {
        return userRepository.getAllByFullNameContaining(name);
    }
}
