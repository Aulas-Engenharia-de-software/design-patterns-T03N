package org.example.withPattern

import org.example.shared.DummyList

class DisplayWithPattern {
    val produtos = DummyList
    var produtosFiltrados = produtos

    fun filtrar() {
        println("\n========\nSEM FILTROS\n=======")
        produtosFiltrados = produtos
        display()
    }
    fun filtrar(filtro: IFiltroProduto) {
        println("\n======\nFiltro por ${filtro.declare()}\n=======")
        produtosFiltrados = filtro.filtrar(produtos)
        display()
    }
    fun filtrar(filtros: List<IFiltroProduto>) {
        val declarations = filtros.map { it.declare() }.joinToString("\n") { "- $it"}
        println("\n======\nFiltro por:\n$declarations\n========")
        produtosFiltrados = produtos
        filtros.forEach { filtro ->
            produtosFiltrados = filtro.filtrar(produtosFiltrados)
        }
        display()
    }
    private fun display() {
        produtosFiltrados.forEach {
            println(it)
        }
    }
}