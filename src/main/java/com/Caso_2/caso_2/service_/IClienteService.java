/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Caso_2.caso_2.service_;

/**
 *
 * @author user
 */
import org.springframework.security.core.userdetails.*;
public interface IClienteService {
    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException;
}
