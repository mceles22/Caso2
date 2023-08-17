/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Caso_2.caso_2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author LABORATORIO 04
 */
//Se establece la entidad rol
@Entity
@Data
@Table(name = "Roles")
public class Rol implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
     @NotEmpty
    private String nombre;
}
