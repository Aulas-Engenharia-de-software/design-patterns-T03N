package org.example.withoutPattern

import org.example.shared.CategoryEnum
import org.example.withoutPattern.DisplayWithoutPattern

class MainWithoutPattern {
    init {
        val loja = DisplayWithoutPattern()
        loja.filtrar()
        loja.filtrar(FiltrosDto())
        loja.filtrar(FiltrosDto(filtroAvaliacao = 4.0))
        loja.filtrar(FiltrosDto(filtroCategoria = CategoryEnum.ELETRONICOS, filtroPrecoMaximo = 70.0))
    }
}