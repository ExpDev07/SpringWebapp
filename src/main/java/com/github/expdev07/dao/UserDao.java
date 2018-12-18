package com.github.expdev07.dao;

import com.github.expdev07.entity.User;
import com.github.expdev07.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * A dao for users
 */
@Service
public class UserDao  {

    @Autowired
    private UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }


    public List<User> findAll(){
        return repository.findAll();
    }


    public Optional<User> findById(long id) {
        return repository.findById(id);
    }


    public void delete(User user) {
        repository.delete(user);
    }

}