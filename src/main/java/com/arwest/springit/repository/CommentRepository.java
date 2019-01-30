package com.arwest.springit.repository;

import com.arwest.springit.domain.Comment;
import com.arwest.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    //Link findbyTitle(String title);
}
