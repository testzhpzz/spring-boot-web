package com.pan.springbootweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface UserJpa extends JpaRepository<UserEntity,Long>{
@Query(value = "select * from user where username= ?1",nativeQuery = true)
    List<UserEntity> findByUsername(String username);
}
