package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Test2Model;

@Repository
public interface Tesy2Repo  extends JpaRepository<Test2Model, Integer>{

}
