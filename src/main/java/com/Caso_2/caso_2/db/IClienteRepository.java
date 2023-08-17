/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Caso_2.caso_2.db;

import com.Caso_2.caso_2.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface IClienteRepository extends JpaRepository<Cliente, Long >{
    Cliente findByUsername(String username);
    
    Cliente findByUsernameAndPassword(String username, String Password);

    Cliente findByUsernameOrCorreo(String username, String correo);

    boolean existsByUsernameOrCorreo(String username, String correo);
}
