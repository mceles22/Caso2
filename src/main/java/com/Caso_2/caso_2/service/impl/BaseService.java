/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Caso_2.caso_2.service.impl;

import com.Caso_2.caso_2.service_.IBaseService;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public class BaseService<T, Y> implements IBaseService<T, Y>{
    protected final CrudRepository<T, Y> repository;

    public BaseService(CrudRepository<T, Y> repository) {
        this.repository = repository;
    }

    public List<T> getAll() {
        return (List<T>) this.repository.findAll();
    }

    public T save(T item) {
        return this.repository.save(item);
    }

    public Optional<T> getById(Y id) {
        return this.repository.findById(id);
    }

    public void delete(T item) {
        this.repository.delete(item);
    }
}
