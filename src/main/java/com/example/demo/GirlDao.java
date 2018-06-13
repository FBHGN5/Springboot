package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlDao extends JpaRepository<Girl,Integer> {

    public List<Girl> findByAge(int age);
}
