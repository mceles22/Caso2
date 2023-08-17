/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Caso_2.caso_2.db;

import com.Caso_2.caso_2.entities.Cliente;
import com.Caso_2.caso_2.entities.Vuelo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface IVuelosRepository extends CrudRepository<Vuelo, Long > {
    List<Vuelo> findAllByPrecioBetween(int lowerPrice, int higherPrice);
    List<Vuelo> findAllByPrecioGreaterThanEqual(int lowerPrice);
    List<Vuelo> findAllByPrecioIsLessThanEqual(int HigherPrice);
}
