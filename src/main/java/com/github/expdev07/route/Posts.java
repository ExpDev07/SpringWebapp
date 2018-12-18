package com.github.expdev07.route;

import com.github.expdev07.dao.PostDao;
import com.github.expdev07.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class Posts {

    @Autowired
    private PostDao dao;

    @GetMapping("/")
    public List<Post> getAll() {
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public Post get(@PathVariable(value="id") long id) {
        return dao.findById(id).get();
    }

    @PostMapping("/")
    public Post post(@RequestBody Post post) {
        return dao.save(post);
    }

}
