/*
 * Copyright (C) 2020 Oscar Arenas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package vista;

import controlador.ControladorMenu;
import controlador.ControladorPanelOperaciones;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Arenas
 */
public class VistaCalculadora extends JFrame {

    // Campos
    private PanelDatos panelDatos;
    private PanelResultado panelResultados;
    private PanelOperaciones panelOperaciones;
    private BarraMenu barraMenu;

    // Métodos
    public VistaCalculadora() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        setTitle("Calculadora Básica. Por: Oscar Arenas.");

        barraMenu = new BarraMenu();
        setJMenuBar(barraMenu);

        panelResultados = new PanelResultado();
        panelOperaciones = new PanelOperaciones();
        panelDatos = new PanelDatos();

        add(panelDatos, BorderLayout.PAGE_START);
        add(panelResultados, BorderLayout.CENTER);
        add(panelOperaciones, BorderLayout.PAGE_END);

        setSize(760, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void mostrarAcerca() {
        String mensaje = "Versión: 1.0\n\n";
        mensaje += "Aplicación para mostrar el patrón de diseño \n";
        mensaje += "Modelo-Vista-Controlador (MVC).       \n";

        mensaje += "\nCopyright (C) 2020 Oscar H. Arenas A.\n";

        JOptionPane.showMessageDialog(this, mensaje, "Acerca de la aplicación",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void cerrarAplicacion() {
        int respuesta = JOptionPane.showOptionDialog(this,
                "Esta seguro que desea cerrar la aplicación?",
                "Terminar programa", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new String[]{"Si", "No"}, "default");

        if (respuesta == JOptionPane.OK_OPTION) {
            dispose();// Metodo heredado de la clase Window que libera los
        }	     // recursos asignados por el SO a una ventana y sus componentes
    }

    public void limpiar() {
        panelDatos.borrar();
        panelResultados.setResultado(" ");
    }

    public String getNumero1() {
        return panelDatos.getNumero1();
    }

    public String getNumero2() {
        return panelDatos.getNumero2();
    }

    public void registrarControladores(ControladorPanelOperaciones controlador1,
            ControladorMenu controlador2) {
        Component[] componentes = panelOperaciones.getComponents();

        for (Component componente : componentes) {
            if (componente instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) componente;
                button.addActionListener(controlador1);
            }
        }

        componentes = barraMenu.getComponents();

        for (Component componente : componentes) {

            if (componente instanceof JMenu) {
                JMenu menu = (JMenu) componente;
                Component[] componentes2 = menu.getMenuComponents();

                for (Component componente2 : componentes2) {

                    if (componente2 instanceof AbstractButton) {
                        AbstractButton button = (AbstractButton) componente2;
                        button.addActionListener(controlador2);
                    }
                }
            }

        }
    }

    public void mostrarResultado(String texto) {
        panelResultados.setResultado(texto);
    }

    // *************************************************************************
    public void mostrarMensajeError(String mensaje) {
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void mostrarMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}
