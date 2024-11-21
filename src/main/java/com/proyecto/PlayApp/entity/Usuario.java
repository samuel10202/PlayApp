package com.proyecto.PlayApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre_completo;
    private String correo;
    private String passwordU;

    public Usuario() {
    }

    public Usuario(Long id, String nombre_completo, String correo, String passwordU) {
        this.id = id;
        this.nombre_completo = nombre_completo;
        this.correo = correo;
        this.passwordU = passwordU;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_completo() {
        return this.nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPasswordU() {
        return this.passwordU;
    }

    public void setPasswordU(String passwordU) {
        this.passwordU = passwordU;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre_completo='" + nombre_completo + '\'' +
                ", correo='" + correo + '\'' +
                ", passwordU='" + passwordU + '\'' +
                '}';
    }
}
