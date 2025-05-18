package org.example.withPattern

import org.example.shared.ProdutoDto

interface IFiltroProduto {
    fun filtrar(lista: List<ProdutoDto>): List<ProdutoDto>
    fun declare(): String
}