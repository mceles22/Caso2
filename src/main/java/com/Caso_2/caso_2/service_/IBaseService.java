/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Caso_2.caso_2.service_;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author user
 */
public interface IBaseService <T, Y>{
     List<T> getAll();

    T save(T item);

    void delete(T item);

    Optional<T> getById(Y id);
}
