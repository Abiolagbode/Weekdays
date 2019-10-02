package com.etz.weekdays.repository;

import org.springframework.data.repository.CrudRepository;

import com.etz.weekdays.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
