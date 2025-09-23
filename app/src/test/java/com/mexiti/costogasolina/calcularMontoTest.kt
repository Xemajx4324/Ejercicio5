package com.mexiti.costogasolina


import org.junit.Test
import java.text.NumberFormat
import org.junit.Assert.assertEquals

class CalcularMontoTest {

    @Test
    fun calcularMonto201_23_94(){
        val precio = 22.35
        val cantLitros = 40.0
        val darPropina = false

        val montoEsperado = NumberFormat.getCurrencyInstance().format(894.0)

        val montoActual = calcularMonto(precio,cantLitros,darPropina, propina = 0.0)

        assertEquals("Comparacion entre montos",montoEsperado, montoActual)

    }
}