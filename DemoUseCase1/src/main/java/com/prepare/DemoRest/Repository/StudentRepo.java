package com.prepare.DemoRest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prepare.DemoRest.Entity.User;

public interface StudentRepo extends JpaRepository<User, Long>{

}
