package com.arwest.springit.repository;

import com.arwest.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;
// chain properties together to build custom queries
public interface LinkRepository extends JpaRepository<Link, Long> {


}
