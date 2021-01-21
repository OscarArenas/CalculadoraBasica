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
package calculadorabasica;

import controlador.ControladorPanelOperaciones;
import controlador.ControladorMenu;
import vista.VistaCalculadora;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Calculadora;

/**
 *
 * @author Oscar Arenas
 */
public class CalculadoraBasica {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                crearYMostrarGUI();
            }
        });
    }

    private static void crearYMostrarGUI() {
        try {
            // Se establece el aspecto de la interfaz gráfica de acuerdo
            // al sistema operativo (SO) en el que se ejecuta la aplicación.
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager
                    .getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException exc) {
        }

        Calculadora modelo = new Calculadora();
        VistaCalculadora vista = new VistaCalculadora();

        // Controladores
        ControladorPanelOperaciones controlador1
                = new ControladorPanelOperaciones(modelo, vista);
        ControladorMenu controlador2
                = new ControladorMenu(modelo, vista);

        vista.registrarControladores(controlador1, controlador2);
        vista.setVisible(true);
    }
}
