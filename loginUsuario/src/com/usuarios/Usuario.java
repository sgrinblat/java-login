package com.usuarios;

import javax.swing.*;

public class Usuario {
    private String nombreUsuario;
    private String passwordUsuario;
    private String preguntaSecretaUsuario;

    public Usuario(String nombreUsuario, String passwordUsuario, String preguntaSecretaUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
        this.preguntaSecretaUsuario = preguntaSecretaUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public String getPreguntaSecretaUsuario() {
        return preguntaSecretaUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", passwordUsuario='" + passwordUsuario + '\'' +
                ", preguntaSecretaUsuario='" + preguntaSecretaUsuario + '\'' +
                '}';
    }
}
