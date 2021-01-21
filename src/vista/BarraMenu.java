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

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

/**
 *
 * @author Oscar Arenas
 */
public class BarraMenu extends JMenuBar {

    public final static String BORRAR = "BORRAR";
    public final static String SALIR = "SALIR";
    public final static String ACERCA = "ACERCA";
    //
    private JMenu menuControl;
    //
    private JMenuItem itemMenuSalir;
    private JMenuItem itemMenuBorrarTodo;
    //
    private JMenu menuAyuda;
    private JMenuItem itemMenuAcerca;

    public BarraMenu() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        menuControl = new JMenu("Control");
        menuAyuda = new JMenu("Ayuda");

        itemMenuBorrarTodo = new JMenuItem("Borrar todo");
        itemMenuBorrarTodo.setActionCommand(BORRAR);

        itemMenuSalir = new JMenuItem("Salir");
        itemMenuSalir.setActionCommand(SALIR);

        menuControl.add(itemMenuBorrarTodo);
        menuControl.add(new JSeparator());
        menuControl.add(itemMenuSalir);

        itemMenuAcerca = new JMenuItem("Acerca de la aplicación");
        itemMenuAcerca.setActionCommand(ACERCA);

        menuAyuda.add(itemMenuAcerca);

        add(menuControl);
        add(menuAyuda);
    }
}
