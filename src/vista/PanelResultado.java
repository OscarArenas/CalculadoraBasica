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
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Oscar Arenas
 */
public class PanelResultado extends JPanel {

    // Campo
    private JLabel etiquetaResultado;

    // Métodos
    public PanelResultado() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        setBorder(BorderFactory.createTitledBorder("Resultado"));

        etiquetaResultado = new JLabel("  ");
        etiquetaResultado.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 26));

        add(etiquetaResultado);
    }

    public void setResultado(String texto) {
        etiquetaResultado.setText(texto);
    }

    public void limpiar() {
        etiquetaResultado.setText("  ");
    }
}
