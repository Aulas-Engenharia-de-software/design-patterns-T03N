package org.example.withoutPattern

import org.example.shared.CategoryEnum
import org.example.shared.DummyList

class DisplayWithoutPattern {
    val produtos = DummyList
    var produtosFiltrados = produtos

    fun filtrar() {
        println("\n========\nSEM FILTROS\n=======")
        produtosFiltrados = produtos
        display()
    }
    private fun isEmpty(filtros: FiltrosDto): Boolean {
        if (
            filtros.filtroAvaliacao == null &&
            filtros.filtroNome == null &&
            filtros.filtroMarca == null &&
            filtros.filtroCategoria == null &&
            filtros.filtroPrecoMaximo == null &&
            filtros.filtroPrecoMinimo == null
            ) {
            return true
        }
        return false
    }
    fun filtrar(filtros: FiltrosDto?) {
        if (filtros == null || isEmpty(filtros)) {
            filtrar()
            return
        }
        produtosFiltrados = produtos

        println("\n=========\nFiltro por:")
        if (!filtros.filtroNome.isNullOrBlank()) {
            filtrarPorNome(filtros.filtroNome)
        }
        if (filtros.filtroAvaliacao != null) {
            filtrarPorAvaliacao(filtros.filtroAvaliacao)
        }
        if (filtros.filtroCategoria != null) {
            filtrarPorCategoria(filtros.filtroCategoria)
        }
        if (filtros.filtroPrecoMinimo != null) {
            filtrarPorPrecoMinimo(filtros.filtroPrecoMinimo)
        }
        if (filtros.filtroPrecoMaximo != null) {
            filtrarPorPrecoMaximo(filtros.filtroPrecoMaximo)
        }
        /** ETC... **/
        println("========")
        display()
    }

    private fun filtrarPorNome(nome: String) {
        println("- Nome (%$nome%)")
        produtosFiltrados = produtosFiltrados.filter {
            it.nome.lowercase().contains(nome.lowercase().trim())
        }
    }
    private fun filtrarPorAvaliacao(avaliacao: Double) {
        println("- Avaliação (>=$avaliacao)")
        produtosFiltrados = produtosFiltrados.filter {
            it.avaliacao >= avaliacao
        }
    }
    private fun filtrarPorCategoria(categoria: CategoryEnum) {
        println("- Categoria ($categoria)")
        produtosFiltrados = produtosFiltrados.filter {
            it.categoria == categoria
        }
    }
    private fun filtrarPorPrecoMinimo(precoMinimo: Double) {
        println("- Preço Mínimo ($precoMinimo)")
        produtosFiltrados = produtosFiltrados.filter {
            it.preco >= precoMinimo
        }
    }
    private fun filtrarPorPrecoMaximo(precoMaximo: Double) {
        println("- Preço Máximo ($precoMaximo)")
        produtosFiltrados = produtosFiltrados.filter {
            it.preco <= precoMaximo
        }
    }
    private fun display() {
        produtosFiltrados.forEach {
            println(it)
        }
    }
}