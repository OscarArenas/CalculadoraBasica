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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Calculadora;
import vista.BarraMenu;
import vista.VistaCalculadora;

/**
 *
 * @author Oscar Arenas
 */
public class ControladorMenu implements ActionListener {

    private final Calculadora modelo;
    private final VistaCalculadora vista;

    public ControladorMenu(Calculadora modelo, VistaCalculadora vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals(BarraMenu.BORRAR)) {
            vista.limpiar();
        } else if (comando.equals(BarraMenu.ACERCA)) {
            vista.mostrarAcerca();
        } else if (comando.equals(BarraMenu.SALIR)) {
            vista.cerrarAplicacion();
        }
    }
}
