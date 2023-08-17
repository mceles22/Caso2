/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Caso_2.caso_2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author LABORATORIO 04
 */
@Entity
@Data
@Table(name="Cliente")
public class Cliente implements Serializable{
    private static final long serialVersionUID = 1L;
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
     
     @NotEmpty
    
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String nombre_usuario;
    private String contrasena;
    private int id_rol;
    
    
    
    
    @OneToMany
    @JoinColumn(name="id_rol")
    private List<Rol> roles;
}
