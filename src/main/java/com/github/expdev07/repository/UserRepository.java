package com.github.expdev07.repository;

import com.github.expdev07.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * A repository for users
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
