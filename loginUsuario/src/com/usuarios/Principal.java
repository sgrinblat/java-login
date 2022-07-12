package com.usuarios;

import javax.swing.*;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList <Usuario> listaDeUsuarios = new ArrayList<Usuario>();
        listaDeUsuarios.add(new Usuario("julian1212", "aguanteriver12", "buenosaires"));
        listaDeUsuarios.add(new Usuario("maestropizzero5", "sibarita1", "dinamarca"));
        listaDeUsuarios.add(new Usuario("pedroagustin", "marado86", "quilmes"));
        listaDeUsuarios.add(new Usuario("artemio", "sastre", "olavarria"));

        try {
            logearUsuario(listaDeUsuarios);
        } catch (Exception e) {

        }
    }

    static void logearUsuario(ArrayList <Usuario> listaDeUsuarios) {

        int contador = 0;
        int opcionIngresada = JOptionPane.showConfirmDialog(null, "¿Quiere logearse en el sistema con su usuario?");
        if (opcionIngresada == 0) {
            String usuarioIngresado = JOptionPane.showInputDialog("Ingrese su usuario: ");
            String passwordIngresado = JOptionPane.showInputDialog("Ingrese su contraseña: ");

            for (Usuario user: listaDeUsuarios) {
                contador++;
                if (user.getNombreUsuario().equals(usuarioIngresado) && user.getPasswordUsuario().equals(passwordIngresado)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido al sistema " + user.getNombreUsuario());
                    break;
                } else if (user.getNombreUsuario().equals(usuarioIngresado)) {
                    opcionIngresada = JOptionPane.showConfirmDialog(null, "La contraseña que está ingresando no es correcta. ¿Desea cambiar su contraseña?");
                    if (opcionIngresada == 0) {
                        String respuestaPreguntaSecreta = JOptionPane.showInputDialog("Ingrese la respuesta a su pregunta secreta. ¿En dónde naciste?");
                        if (user.getPreguntaSecretaUsuario().equals(respuestaPreguntaSecreta)) {
                            JOptionPane.showMessageDialog(null, "Los datos fueron ingresados correctamente.");
                            String passwordUsuario = JOptionPane.showInputDialog("Ingrese su nueva contraseña: ");
                            String passwordUsuarioDos = JOptionPane.showInputDialog("Ingrese una vez más su nueva contraseña: ");
                            while (!passwordUsuario.equals(passwordUsuarioDos)) {
                                JOptionPane.showMessageDialog(null, "La contraseña ingresada no coincide. Inténtalo nuevamente.");
                                passwordUsuario = JOptionPane.showInputDialog("Ingrese su nueva contraseña: ");
                                passwordUsuarioDos = JOptionPane.showInputDialog("Ingrese una vez más su nueva contraseña: ");
                            }
                            user.setPasswordUsuario(passwordUsuarioDos);
                            JOptionPane.showMessageDialog(null, "La contraseña ha sido cambiado exitosamente.");
                            contador = 0;
                            logearUsuario(listaDeUsuarios);
                        } else {
                            JOptionPane.showMessageDialog(null, "La respuesta no es correcta. Volverás al menú principal.");
                            contador = 0;
                            logearUsuario(listaDeUsuarios);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Has elegido no cambiar la contraseña del usuario. Volverás al menú principal.");
                        contador = 0;
                        logearUsuario(listaDeUsuarios);
                    }
                } else if (contador >= listaDeUsuarios.size()) {
                    contador = 0;
                    int nuevaOpcionIngresada = JOptionPane.showConfirmDialog(null, "Los datos ingresados no coinciden con ningún usuario registrado en el sistema. ¿Quieres registrar una cuenta? Si presionas 'no', volverás al menú principal.");
                    if (nuevaOpcionIngresada == 0) {
                        String userName = JOptionPane.showInputDialog("Ingrese el nombre de su usuario: ");
                        for(Usuario userDos: listaDeUsuarios){
                            while(userDos.getNombreUsuario().equals(userName)) {
                                JOptionPane.showMessageDialog(null, "Lo sentimos. Ese nombre de usuario ya se encuentra registrado.");
                                userName = JOptionPane.showInputDialog("Inténtalo nuevamente. Ingrese el nombre de su usuario: ");
                            }
                        }
                        String password = JOptionPane.showInputDialog("Ingrese la contraseña de su usuario: ");
                        String passwordDos = JOptionPane.showInputDialog("Ingrese nuevamente la contraseña de su usuario: ");
                        while (!password.equals(passwordDos)) {
                            JOptionPane.showMessageDialog(null, "La contraseña ingresada no coincide. Inténtalo nuevamente.");
                            password = JOptionPane.showInputDialog("Ingrese su contraseña: ");
                            passwordDos = JOptionPane.showInputDialog("Ingrese una vez más su contraseña: ");
                        }
                        String preguntaSecreta = JOptionPane.showInputDialog("Ingrese una respuesta a la siguiente pregunta '¿Dónde naciste?: (Esto lo ayudará a recuperar su contraseña en el caso de olvido).");

                        listaDeUsuarios.add(new Usuario(userName, password, preguntaSecreta));
                        JOptionPane.showMessageDialog(null, "El usuario ha sido creado exitosamente. Serás redirigido al menú principal y ya podrás logearte.");
                        logearUsuario(listaDeUsuarios);
                    } else {
                        logearUsuario(listaDeUsuarios);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Has decidido salir del sistema.");
        }
    }
}