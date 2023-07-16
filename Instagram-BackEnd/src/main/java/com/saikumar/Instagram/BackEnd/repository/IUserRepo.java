package com.saikumar.Instagram.BackEnd.repository;

import com.saikumar.Instagram.BackEnd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Long> {

    User findFirstByUserEmail(String newEmail);
}
