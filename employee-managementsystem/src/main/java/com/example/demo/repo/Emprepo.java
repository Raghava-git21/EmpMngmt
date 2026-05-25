package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmpEntity;

@Repository
public interface Emprepo extends JpaRepository<EmpEntity, Long>{

}
