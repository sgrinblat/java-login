package com.usuarios;

import javax.swing.*;
import java.util.ArrayList;

//public class paraborrar {
//    Usuario usuarioUno = new Usuario("julian1212", "aguanteriver12", "buenosaires");
//    Usuario usuarioDos = new Usuario("maestropizzero5", "sibarita1", "dinamarca");
//    Usuario usuarioTres = new Usuario("pedroagustin", "marado86", "quilmes");
//    Usuario usuarioCuatro = new Usuario("artemio", "sastre", "olavarria");
//
//    Usuario[] lista = new Usuario[]{usuarioUno, usuarioDos, usuarioTres, usuarioCuatro};
//    ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
//
//    logearUsuario(lista);
//}
//
//    static void logearUsuario(Usuario[] lista) {
//
//        int opcionIngresada = JOptionPane.showConfirmDialog(null, "¿Quiere logearse en el sistema con su usuario?");
//        if (opcionIngresada == 0) {
//            String usuarioIngresado = JOptionPane.showInputDialog("Ingrese su usuario: ");
//            String passwordIngresado = JOptionPane.showInputDialog("Ingrese su contraseña: ");
//
//            for (int i = 0; i < lista.length; i++) {
//                if (lista[i].getNombreUsuario().equals(usuarioIngresado) && lista[i].getPasswordUsuario().equals(passwordIngresado)) {
//                    JOptionPane.showMessageDialog(null, "Bienvenido al sistema " + lista[i].getNombreUsuario());
//                    i = (lista.length + 1);
//                } else if (lista[i].getNombreUsuario().equals(usuarioIngresado)) {
//                    opcionIngresada = JOptionPane.showConfirmDialog(null, "La contraseña que está ingresando no es correcta. ¿Desea cambiar su contraseña?");
//                    if (opcionIngresada == 0) {
//                        String respuestaPreguntaSecreta = JOptionPane.showInputDialog("Ingrese la respuesta a su pregunta secreta. ¿En dónde naciste?");
//                        if (lista[i].getPreguntaSecretaUsuario().equals(respuestaPreguntaSecreta)) {
//                            JOptionPane.showMessageDialog(null, "Los datos fueron ingresados correctamente.");
//                            String passwordUsuario = JOptionPane.showInputDialog("Ingrese su nueva contraseña: ");
//                            String passwordUsuarioDos = JOptionPane.showInputDialog("Ingrese una vez más su nueva contraseña: ");
//                            while (!passwordUsuario.equals(passwordUsuarioDos)) {
//                                JOptionPane.showMessageDialog(null, "La contraseña ingresada no coincide. Inténtalo nuevamente.");
//                                passwordUsuario = JOptionPane.showInputDialog("Ingrese su nueva contraseña: ");
//                                passwordUsuarioDos = JOptionPane.showInputDialog("Ingrese una vez más su nueva contraseña: ");
//                            }
//                            lista[i].setPasswordUsuario(passwordUsuarioDos);
//                            JOptionPane.showMessageDialog(null, "La contraseña ha sido cambiado exitosamente.");
//                            logearUsuario(lista);
//                        } else {
//                            JOptionPane.showMessageDialog(null, "La respuesta no es correcta. Volverás al menú principal.");
//                            logearUsuario(lista);
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Has elegido no cambiar la contraseña del usuario. Volverás al menú principal.");
//                        logearUsuario(lista);
//                    }
//                } else if (i == (lista.length - 1)) {
//                    JOptionPane.showMessageDialog(null, "Los datos ingresados no coinciden con ningún usuario registrado en el sistema. Inténtalo nuevamente.");
//                    logearUsuario(lista);
//                }
//            }
//        }
//    }
//}
