package com.github.expdev07.route;

import com.github.expdev07.dao.UserDao;
import com.github.expdev07.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Users {

    @Autowired
    private UserDao dao;

    @GetMapping("/")
    public List<User> getAll() {
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public User get(@PathVariable(value="id") long id) {
        return dao.findById(id).get();
    }

    @PostMapping("/")
    public User post(@RequestBody User user) {
        return dao.save(user);
    }

}
