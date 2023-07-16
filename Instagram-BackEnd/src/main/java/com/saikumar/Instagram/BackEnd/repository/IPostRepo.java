package com.saikumar.Instagram.BackEnd.repository;

import com.saikumar.Instagram.BackEnd.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepo extends JpaRepository<Post,Long> {

}
