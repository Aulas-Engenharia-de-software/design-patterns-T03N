package org.example.withPattern

import org.example.shared.CategoryEnum

class MainWithPattern {
    init {
        val loja = DisplayWithPattern()

        /* Sem Filtros */
        loja.filtrar()

        /* Com um filtro, várias vezes */
        loja.filtrar(FiltroPorAvaliacao())
        loja.filtrar(FiltroPorAvaliacao(1.0))
        loja.filtrar(FiltroPorPreco(30.0, 100.0))

        /* Com vários filtro */
        loja.filtrar(listOf(
            FiltroPorPreco(0.0, 40.0),
            FiltroPorAvaliacao(3.0),
        ))

        loja.filtrar(listOf(
            FiltroPorPreco(0.0, 70.0),
            FiltroPorCategoria(CategoryEnum.ELETRONICOS),
        ))
    }
}