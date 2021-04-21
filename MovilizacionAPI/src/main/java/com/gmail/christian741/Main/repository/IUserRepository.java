package com.gmail.christian741.Main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.gmail.christian741.Main.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer>,PagingAndSortingRepository<User, Integer> {

}
