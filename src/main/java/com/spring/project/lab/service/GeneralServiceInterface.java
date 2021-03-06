package com.spring.project.lab.service;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;


public interface GeneralServiceInterface<T> {
    JpaRepository<T, Integer> getRepository();
    List<T> findAll();
    T find(Integer id);
    @Transactional
    void create(T t);
    @Transactional
    void update(T t);
    @Transactional
    void delete(Integer id);
}
