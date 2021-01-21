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

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Oscar Arenas
 */
public class PanelDatos extends JPanel {

    private JLabel etiquetaNumero1;
    private JTextField campoTextoNumero1;
    private JLabel etiquetaNumero2;
    private JTextField campoTextoNumero2;

    public PanelDatos() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createTitledBorder("Datos"));

        int ancho = 30;

        Font letra = new Font(Font.SERIF, Font.PLAIN, 16);
        Font letra2 = new Font(Font.SERIF, Font.BOLD, 18);

        etiquetaNumero1 = new JLabel("Primer número:");
        etiquetaNumero1.setHorizontalAlignment(JLabel.RIGHT);
        campoTextoNumero1 = new JTextField(ancho);
        etiquetaNumero1.setFont(letra);
        campoTextoNumero1.setFont(letra2);

        etiquetaNumero2 = new JLabel("Segundo número:");
        etiquetaNumero2.setHorizontalAlignment(JLabel.RIGHT);
        campoTextoNumero2 = new JTextField(ancho);
        etiquetaNumero2.setFont(letra);
        campoTextoNumero2.setFont(letra2);

        GridBagConstraints gbc;

        gbc = new GridBagConstraints(0, 0, 1, 1, 0, 0,
                GridBagConstraints.WEST, GridBagConstraints.BOTH,
                new Insets(5, 5, 5, 5), 0, 0);
        add(etiquetaNumero1, gbc);

        gbc = new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0);
        add(campoTextoNumero1, gbc);

        gbc = new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0);
        add(etiquetaNumero2, gbc);

        gbc = new GridBagConstraints(1, 1, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0);
        add(campoTextoNumero2, gbc);
    }

    public String getNumero1() {
        return campoTextoNumero1.getText().trim();
    }

    public String getNumero2() {
        return campoTextoNumero2.getText().trim();
    }

    public void borrar() {
        campoTextoNumero1.setText("");
        campoTextoNumero2.setText("");
        
        campoTextoNumero1.grabFocus();
    }
}
