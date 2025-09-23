package com.mexiti.costogasolina

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.mexiti.costogasolina.ui.theme.CostoGasolinaTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class CalcularMontoUITest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calcular_Monto_201_24_94() {
        composeTestRule.setContent { CostoGasolinaTheme { CostGasLayout() } }

        val fields = composeTestRule.onAllNodes(
            hasSetTextAction(), useUnmergedTree = true
        )

        // Campo 0: precio por litro
        fields[0].performClick()
        fields[0].performTextInput("22.35")

        // Campo 1: litros
        fields[1].performClick()
        fields[1].performTextInput("40")

        val esperado = NumberFormat.getCurrencyInstance().format(22.35 * 40)

        composeTestRule.onNode(hasText("Monto Total: $esperado")).assertExists()
    }
}