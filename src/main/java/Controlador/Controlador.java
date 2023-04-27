/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author sebasvillamizar
 */

import java.awt.Image;
import Modelo.Modelo;
import Vista.Vista;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Controlador {
private JFrame ventana;
private Modelo Modelo;
private Vista Vista;

public Controlador() {
Modelo = new Modelo(getImagen());
Vista = new Vista(Modelo.getImagen());
ventana = new JFrame("Dibujando Imagen");
ventana.add(Vista);
ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ventana.setSize(300, 300);
ventana.setVisible(true);
}

private Image getImagen() {
//Cargamos la imagen a dibujar
ImageIcon icono = new ImageIcon("C:\\Users\\juansebasvibo\\Images\\perro.jpg");
return icono.getImage();
}

public static void main(String[] args) {
new Controlador();
}
}
