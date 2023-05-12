package com.academy.MYSql.repo;

import com.academy.MYSql.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person,String> {
}
