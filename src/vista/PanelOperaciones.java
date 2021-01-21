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

import controlador.ControladorPanelOperaciones;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Oscar Arenas
 */
public class PanelOperaciones extends JPanel {

    public final static String SUMAR = "SUMAR";
    public final static String RESTAR = "RESTAR";
    public final static String MULTIPLICAR = "MULTIPLICAR";
    public final static String DIVIDIR = "DIVIDIR";
    //
    private JButton botonSumar;
    private JButton botonRestar;
    private JButton botonMultiplicar;
    private JButton botonDividir;

    public PanelOperaciones() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        setBorder(BorderFactory.createTitledBorder("Operaciones"));

        botonSumar = new JButton("Sumar");
        botonSumar.setToolTipText("Suma los dos números.");
        botonSumar.setActionCommand(PanelOperaciones.SUMAR);
        botonSumar.setFocusable(false);

        botonRestar = new JButton("Restar");
        botonRestar.setToolTipText("Resta el segundo número del primero.");
        botonRestar.setActionCommand(PanelOperaciones.RESTAR);
        botonRestar.setFocusable(false);

        botonMultiplicar = new JButton("Multiplicar");
        botonMultiplicar.setToolTipText("Multiplica los dos números.");

        botonMultiplicar.setActionCommand(PanelOperaciones.MULTIPLICAR);
        botonMultiplicar.setFocusable(false);

        botonDividir = new JButton("Dividir");
        botonDividir.setToolTipText("Divide el primer número entre el segundo.");
        botonDividir.setActionCommand(PanelOperaciones.DIVIDIR);

        botonDividir.setFocusable(false);

        add(botonSumar);
        add(botonRestar);
        add(botonMultiplicar);
        add(botonDividir);
    }
}
