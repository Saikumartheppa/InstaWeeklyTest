package com.saikumar.Instagram.BackEnd.repository;

import com.saikumar.Instagram.BackEnd.model.AuthenticationToken;
import com.saikumar.Instagram.BackEnd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {

    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);
}
