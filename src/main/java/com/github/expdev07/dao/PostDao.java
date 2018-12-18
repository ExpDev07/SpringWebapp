package com.github.expdev07.dao;

import com.github.expdev07.entity.Post;
import com.github.expdev07.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * A dao for posts
 */
@Service
public class PostDao  {

    @Autowired
    private PostRepository repository;

    public Post save(Post user) {
        return repository.save(user);
    }


    public List<Post> findAll(){
        return repository.findAll();
    }


    public Optional<Post> findById(long id) {
        return repository.findById(id);
    }


    public void delete(Post user) {
        repository.delete(user);
    }

}