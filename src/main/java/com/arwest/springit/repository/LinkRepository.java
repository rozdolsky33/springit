package com.arwest.springit.repository;

import com.arwest.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

// chain properties together to build custom queries
//marker interface
public interface LinkRepository extends JpaRepository<Link, Long> {

    //spring data let us define method / writes query under the hood
   // Link findByTitle(String title);

}


/*
 JpaRepositories super interface is Repository<T,ID>
 Repository<T,ID> is a marker interface. General purpose is to hold type information as wel as
 being able to discover interfaces tha that extend thi one during classpath scanning for Spring
 bean creation.



 extending this interface can selectevly expose CRUD methods of the same signature declared
 in CrudRepository

 */