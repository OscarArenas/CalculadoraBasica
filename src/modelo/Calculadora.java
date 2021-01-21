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
package modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Oscar Arenas
 */
public class Calculadora {

    private BigDecimal operando1;
    private BigDecimal operando2;

    public Calculadora() {
    }

    public Calculadora(BigDecimal operando1, BigDecimal operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void setOperando1(BigDecimal operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(BigDecimal operando2) {
        this.operando2 = operando2;
    }

    public void setOperando1(String operando1) throws NumberFormatException {
        this.operando1 = new BigDecimal(darFormato(operando1));
    }

    public void setOperando2(String operando2) throws NumberFormatException {
        this.operando2 = new BigDecimal(darFormato(operando2));
    }

    public BigDecimal sumar() {
        return operando1.add(operando2);
    }

    public BigDecimal restar() {
        return operando1.subtract(operando2);
    }

    public BigDecimal multiplicar() {
        return operando1.multiply(operando2);
    }

    public BigDecimal dividir() {
        return operando1.divide(operando2, 3, RoundingMode.CEILING);
    }

    private String darFormato(String cadena) {
        cadena = cadena.trim();

        if (cadena.matches("[0-9]*,[0-9]+|[0-9]+,[0-9]*")) {
            cadena = cadena.replace(',', '.');
        }
        return cadena;
    }
}
