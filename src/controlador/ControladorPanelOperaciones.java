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
package controlador;

import vista.VistaCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Calculadora;
import vista.PanelDatos;
import vista.PanelOperaciones;

/**
 *
 * @author Oscar Arenas
 */
public class ControladorPanelOperaciones implements ActionListener {

    private Calculadora modelo;
    private VistaCalculadora vista;

    public ControladorPanelOperaciones(Calculadora modelo, VistaCalculadora vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals(PanelOperaciones.SUMAR)) {
            sumar();
        } else if (comando.equals(PanelOperaciones.RESTAR)) {
            restar();
        } else if (comando.equals(PanelOperaciones.MULTIPLICAR)) {
            multiplicar();
        } else if (comando.equals(PanelOperaciones.DIVIDIR)) {
            dividir();
        }
    }

    private void sumar() {
        String n1 = vista.getNumero1();
        String n2 = vista.getNumero2();

        try {
            modelo.setOperando1(n1);
            try {
                modelo.setOperando2(n2);

                vista.mostrarResultado("La suma es: " + modelo.sumar());

            } catch (NumberFormatException exc) {
                if (n2.isEmpty()) {
                    vista.mostrarMensajeError("Ingrese el segundo número");
                } else {
                    vista.mostrarMensajeError("'" + n2 + "' no es un número");
                }
            }
        } catch (NumberFormatException exc) {
            if (n1.isEmpty()) {
                vista.mostrarMensajeError("Ingrese el primer número");
            } else {
                vista.mostrarMensajeError("'" + n1 + "' no es un número");
            }
        }
    }

    private void restar() {
        String n1 = vista.getNumero1();
        String n2 = vista.getNumero2();

        try {
            modelo.setOperando1(n1);
            try {
                modelo.setOperando2(n2);

                vista.mostrarResultado("La resta es: " + modelo.restar());

            } catch (NumberFormatException exc) {
                if (n2.isEmpty()) {
                    vista.mostrarMensajeError("Ingrese el segundo número");
                } else {
                    vista.mostrarMensajeError("'" + n2 + "' no es un número");
                }
            }
        } catch (NumberFormatException exc) {
            if (n1.isEmpty()) {
                vista.mostrarMensajeError("Ingrese el primer número");
            } else {
                vista.mostrarMensajeError("'" + n1 + "' no es un número");
            }
        }
    }

    private void multiplicar() {
        String n1 = vista.getNumero1();
        String n2 = vista.getNumero2();

        try {
            modelo.setOperando1(n1);
            try {
                modelo.setOperando2(n2);

                vista.mostrarResultado("El producto es: " + modelo.multiplicar());

            } catch (NumberFormatException exc) {
                if (n2.isEmpty()) {
                    vista.mostrarMensajeError("Ingrese el segundo número");
                } else {
                    vista.mostrarMensajeError("'" + n2 + "' no es un número");
                }
            }
        } catch (NumberFormatException exc) {
            if (n1.isEmpty()) {
                vista.mostrarMensajeError("Ingrese el primer número");
            } else {
                vista.mostrarMensajeError("'" + n1 + "' no es un número");
            }
        }
    }

    private void dividir() {
        String n1 = vista.getNumero1();
        String n2 = vista.getNumero2();

        try {
            modelo.setOperando1(n1);
            try {
                modelo.setOperando2(n2);

                vista.mostrarResultado("La división es: " + modelo.dividir());

            } catch (NumberFormatException exc) {
                if (n2.isEmpty()) {
                    vista.mostrarMensajeError("Ingrese el segundo número");
                } else {
                    vista.mostrarMensajeError("'" + n2 + "' no es un número");
                }
            } catch (ArithmeticException exc) {
                vista.mostrarMensajeError("El divisor debe ser diferente de cero.");
            }
        } catch (NumberFormatException exc) {
            if (n1.isEmpty()) {
                vista.mostrarMensajeError("Ingrese el primer número");
            } else {
                vista.mostrarMensajeError("'" + n1 + "' no es un número");
            }
        }
    }
}
